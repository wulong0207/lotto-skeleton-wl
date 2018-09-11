package com.hhly.skeleton.base.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;

import org.apache.commons.net.PrintCommandListener;
import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPFile;
import org.apache.commons.net.ftp.FTPReply;
import org.apache.commons.net.ftp.FTPSClient;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @desc
 * @author YiJian
 * @date 2017年7月25日 下午4:43:10
 * @company 深圳益彩网络科技有限公司
 * @version v1.1
 */
public class FtpUtil  {
	private static Logger logger = LogManager.getLogger(FtpUtil.class);

	private static FTPSClient ftp;

	/**
	 * 
	 * @param path
	 *            上传到ftp服务器哪个路径下
	 * @param addr
	 *            地址
	 * @param port
	 *            端口号
	 * @param username
	 *            用户名
	 * @param password
	 *            密码
	 * @return
	 * @throws Exception
	 */
	public static boolean connect(String path, String addr, int port, String username, String password)
			throws Exception {
		logger.info("ftp ready to connect,path:" + addr + ":" + port);
		boolean result = false;
		ftp = new FTPSClient();
		ftp.setAuthValue("TLS");
		ftp.addProtocolCommandListener(new PrintCommandListener(new PrintWriter(System.out)));
		ftp.setDefaultTimeout(50000);
		int reply;
		ftp.connect(addr, port);
		ftp.login(username, password);
		reply = ftp.getReplyCode();
		if (!FTPReply.isPositiveCompletion(reply)) {
			logger.info("ftp login error... replyCode:" + reply);
			ftp.disconnect();
			return result;
		}
		ftp.execPBSZ(0);
		ftp.execPROT("P");
		ftp.setFileTransferMode(FTP.STREAM_TRANSFER_MODE);
		ftp.enterLocalPassiveMode();
		result = ftp.changeWorkingDirectory(path);
		if (!result) {
			logger.info("ftp changeWorkingDirectory error... path:" + path);
			return result;
		}
		ftp.setControlEncoding("UTF-8");
		result = true;
		return result;
	}

	/**
	 * 
	 * @param file
	 *            上传的文件或文件夹
	 * @throws Exception
	 */
	public static boolean upload(File file) throws Exception {
		boolean result = false;
		if (file.isDirectory()) {
			ftp.makeDirectory(file.getName());
			ftp.changeWorkingDirectory(file.getName());
			String[] files = file.list();
			for (int i = 0; i < files.length; i++) {
				File file1 = new File(file.getPath() + "\\" + files[i]);
				if (file1.isDirectory()) {
					result = upload(file1);
					ftp.changeToParentDirectory();
				} else {
					File file2 = new File(file.getPath() + "\\" + files[i]);
					FileInputStream input = new FileInputStream(file2);
					result = ftp.storeFile(file2.getName(), input);
					if (result) {
						logger.info("上传文件【" + file2.getName() + "】到ftp成功..");
					} else {
						logger.info("上传文件【" + file2.getName() + "】到ftp失败..");
					}					input.close();
					// 退出ftp
					ftp.logout();
				}
			}
		} else {
			File file2 = new File(file.getPath());
			FileInputStream input = new FileInputStream(file2);
			result = ftp.storeFile(file2.getName(), input);
			if (result) {
				logger.info("上传文件【" + file2.getName() + "】到ftp成功..");
			} else {
				logger.info("上传文件【" + file2.getName() + "】到ftp失败..");
			}
			input.close();
			// 退出ftp
			ftp.logout();
		}
		return result;
	}

	/**
	 * 
	 * 下载FTP文件
	 * 
	 * @param ftpFile
	 *            文件名
	 * @param relativeLocalPath
	 *            本地地址
	 * @param relativeRemotePath
	 *            远程地址
	 */
	public static void downloadFile(FTPFile ftpFile, String relativeLocalPath, String relativeRemotePath)
			throws Exception {
		if (ftpFile.isFile()) {
			if (ftpFile.getName().indexOf("?") == -1) {
				OutputStream outputStream = null;
				File locaFile = new File(relativeLocalPath + ftpFile.getName());
				// 判断文件是否存在，存在则返回
				if (locaFile.exists()) {
					return;
				} else {
					outputStream = new FileOutputStream(relativeLocalPath + ftpFile.getName());
					ftp.retrieveFile(ftpFile.getName(), outputStream);
					outputStream.flush();
					outputStream.close();
				}
				if (outputStream != null) {
					outputStream.close();
				}
			}
		} else {
			String newlocalRelatePath = relativeLocalPath + ftpFile.getName();
			String newRemote = new String(relativeRemotePath + ftpFile.getName().toString());
			File fl = new File(newlocalRelatePath);
			if (!fl.exists()) {
				fl.mkdirs();
			}
			newlocalRelatePath = newlocalRelatePath + '/';
			newRemote = newRemote + "/";
			String currentWorkDir = ftpFile.getName().toString();
			boolean changedir = ftp.changeWorkingDirectory(currentWorkDir);
			if (changedir) {
				FTPFile[] files = null;
				files = ftp.listFiles();
				for (int i = 0; i < files.length; i++) {
					downloadFile(files[i], newlocalRelatePath, newRemote);
				}
			}
			if (changedir) {
				ftp.changeToParentDirectory();
			}
		}
	}

	public static void main(String[] args) {
		boolean isConnect;
		try {
			isConnect = FtpUtil.connect("/data/ftp/etl/ycwl", "192.168.74.159", 21, "ycwl", "123456");
			if (isConnect) {
				// 4. 上传CSV文件到FTP
				File betcsv = new File("E:\\helloworld.csv");
				boolean result = FtpUtil.upload(betcsv);
				System.out.println(result);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
