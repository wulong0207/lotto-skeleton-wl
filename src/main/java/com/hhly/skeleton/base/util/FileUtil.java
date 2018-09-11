package com.hhly.skeleton.base.util;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.hhly.skeleton.base.bo.ResultBO;
import com.hhly.skeleton.base.common.LotteryEnum;
import com.hhly.skeleton.base.common.SingleUploadEnum.EncodingType;
import com.hhly.skeleton.base.common.SingleUploadEnum.UploadType;
import com.hhly.skeleton.base.constants.Constants;
import com.hhly.skeleton.base.constants.SymbolConstants;
import com.hhly.skeleton.base.constants.UserConstants;
import com.hhly.skeleton.base.qiniu.QiniuUpload;
import com.hhly.skeleton.base.qiniu.QiniuUploadVO;
import com.hhly.skeleton.lotto.base.singleupload.vo.SingleUploadJCVO;

/**
 * 文件处理
 * @author HouXB
 *
 */
public class FileUtil {
	
	private static Logger logger = LoggerFactory.getLogger(FileUtil.class);
	
	@SuppressWarnings("unused")
	public static String WriteHttpBuffer(String url, String outdir)
			throws IOException {
		File dir = new File(outdir);
		if (!dir.exists())
			dir.mkdirs();

		URL sjwurl = null;
		HttpURLConnection httpUrl = null;
		BufferedInputStream bis = null;
		byte[] buf = new byte[1024];

		sjwurl = new URL(url);
		httpUrl = (HttpURLConnection) sjwurl.openConnection();
		httpUrl.connect();

		String filename = httpUrl.getHeaderField("Content-Disposition");

		if (filename != null && filename.indexOf("filename=") > 0) {
			filename = filename.substring(filename.indexOf("filename=") + 9);
			filename = java.net.URLDecoder.decode(filename, "utf-8");
		} else {
			filename = url.substring(url.lastIndexOf('/'));
		}
		RandomAccessFile raf = new RandomAccessFile(new File(dir, filename),
				"rw");

		bis = new BufferedInputStream(httpUrl.getInputStream());
		if (bis == null)
			return null;
		int bytes_read = -1;
		while ((bytes_read = bis.read(buf)) > 0) {
			raf.write(buf, 0, bytes_read);
		}
		bis.close();
		raf.close();
		httpUrl.disconnect();

		return filename;
	}

	/**
	 * 读指定文件
	 * 
	 * @param filePath
	 * @return
	 */
	public static String readFile(String filePath) {
		String content = "";
		try {

			String encoding = "UTF-8";
			File file = new File(filePath);
			if (file.isFile() && file.exists()) { // 判断文件是否存在
				InputStreamReader read = new InputStreamReader(
						new FileInputStream(file), encoding);// 考虑到汉子编码格式
				BufferedReader bufferedReader = new BufferedReader(read);
				String lineTxt = null;
				while ((lineTxt = bufferedReader.readLine()) != null) {
					content += lineTxt;
				}
				read.close();
			} else {
				logger.error("找不到指定的文件");
			}
		} catch (Exception e) {
			logger.error("读取文件内容出错:"+e);
		}
		return content;
	}

	/**
	 *  读取每行内容
	 * @param filePath
	 * @return
	 */
	public static String[] readFileLine(String filePath, String charset) {
		List<String> ret = new ArrayList<String>();
		try {
			String encoding = "GBK";
			if(!ObjectUtil.isBlank(charset)){
				encoding = charset;
			}
			File file = new File(filePath);
			if (file.isFile() && file.exists()) { // 判断文件是否存在
				InputStreamReader read = new InputStreamReader(
						new FileInputStream(file), encoding);// 考虑到汉子编码格式
				BufferedReader bufferedReader = new BufferedReader(read);
				String lineTxt = null;
				while ((lineTxt = bufferedReader.readLine()) != null) {
					ret.add(lineTxt);
				}
				bufferedReader.close();
				read.close();
			} else {
				logger.error("找不到指定的文件");
			}
		} catch (Exception e) {
			logger.error("读取文件内容出错" + e);
		}
		return ret.toArray(new String[ret.size()]);
	}
	
	/**
	 * 从7牛云读取文件内容
	 * @author longguoyou
	 * @date 2017年9月19日
	 * @param jczqSingleUploadVO 单式上传参数
	 * @param qiniuUploadVO  7牛云 上传文件配置参数
	 * @param charset 读取文件字符编码
	 * @return
	 */
	public static ResultBO<?> readFileFromQiniu(SingleUploadJCVO jczqSingleUploadVO, QiniuUploadVO qiniuUploadVO, String charset){
		List<String> ret = new ArrayList<String>();
//		qiniuUploadVO.setUploadURL(qiniuUploadVO.getUploadURL());
		QiniuUpload qiniuUpload = new QiniuUpload(qiniuUploadVO);
		ResultBO<?> resultBO = qiniuUpload.readRemoteFileAsList(jczqSingleUploadVO.getFilePath(), charset);
		return resultBO;
	}

	/**
	 *  读取每行内容
	 * @param filePath
	 * @return
	 */
	public static String[] readTwoHundredLine(String filePath, String charset) {
		List<String> ret = new ArrayList<String>();
		try {
			String encoding = "GBK";
			if(!ObjectUtil.isBlank(charset)){
				encoding = charset;
			}
			File file = new File(filePath);
			if (file.isFile() && file.exists()) { // 判断文件是否存在
				InputStreamReader read = new InputStreamReader(
						new FileInputStream(file), encoding);// 考虑到汉子编码格式
				BufferedReader bufferedReader = new BufferedReader(read);
				String lineTxt = null;
				int count = 0;
				while ((lineTxt = bufferedReader.readLine()) != null) {
					ret.add(lineTxt);
					count++;
				}
				if (count > UserConstants.TWO_HUNDRED) {
					bufferedReader.close();
				}
				read.close();
			} else {
				logger.error("找不到指定的文件");
			}
		} catch (Exception e) {
			logger.error("读取文件内容出错:"+e);
		}
		return ret.toArray(new String[ret.size()]);
	}

    /**
	 * 检查文件夹是否存在，不存在创建
	 * @author jiangwei
	 * @Version 1.0
	 * @CreatDate 2017年4月11日 上午9:19:41
	 * @param path
	 */
	public static  void createDir(String path) {
		File myPath = new File(path);
		if (!myPath.exists()) {
			File parent = myPath.getParentFile();
			if( !parent.exists() ) {
				parent.mkdirs();
			}  
			myPath.mkdir();
		}
	}
	
	/**
	 * 获取文件扩展名
	 * @author longguoyou
	 * @date 2017年6月15日
	 * @param filename
	 * @return
	 */
	public static String getExtensionName(String filename) {   
        if ((filename != null) && (filename.length() > 0)) {   
            int dot = filename.lastIndexOf('.');   
            if ((dot >-1) && (dot < (filename.length() - 1))) {   
                return filename.substring(dot + 1);   
            }   
        }   
        return filename;   
    }

	/**
	 * 一行行写入文件,假如存在则删除
	 */
	public static void saveFileFromString(String fileUrl,List<String> texts) throws IOException{
		/*File f = new File(dirPath);
		if (!f.exists()) {
			f.mkdirs();
		}*/
		File oldFile = new File(fileUrl);
		if (oldFile.isFile() && oldFile.exists()) {
			oldFile.delete();
		}
		File file = new File(fileUrl);
		FileWriter fw = new FileWriter(file);
		BufferedWriter writer = new BufferedWriter(fw);
		for(String text : texts){
			writer.write(text+SymbolConstants.NEW_LINE);
			//writer.newLine();//换行
			//writer.write(SymbolConstants.NEW_LINE);//三个系统/r/n都会换行
		}
		if(writer!=null){
			writer.flush();
			writer.close();
		}
		if(fw!=null){
			fw.close();
		}
	}

	/**
	 * 读取txt文件内容，返回List&lt;String&gt;
	 * @author longguoyou
	 * @date 2017年7月13日
	 * @param is
	 * @return
	 */
	public static List<String> getListStringFromFile(InputStream is, String encoding){
		String charset = ObjectUtil.isBlank(encoding)?EncodingType.UFT8.getShortName():encoding;
		List<String> list = new ArrayList<String>();
		InputStreamReader isr = null;
		BufferedReader br = null;
		try {
			isr = new InputStreamReader(is, charset);
			br = new BufferedReader(isr);     
			String line;     
			while((line = br.readLine()) != null){     
				list.add(line);   
			}
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			if(br != null){
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(isr != null){
				try {
					isr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
        return list;
	}

	/**
	 * 单式上传获取文件目录
	 * @author longguoyou
	 * @date 2017年6月15日
	 * @param root 存盘根目录
	 * @param fileType  文件类型txt\zip\rar
	 * @param uploadType 上传类型xzcc\bhcc
	 * @param lotteryCode 彩种编号
	 * @param system win: Window操作系统  Linux:Linux操作系统
	 * @return
	 */
	public static String getFilePath(String root, String fileType, String uploadType,  Integer lotteryCode){
		StringBuffer sBuffer = new StringBuffer();
		String separate = SymbolConstants.OBLIQUE_LINE;//默认Linux
		String os = System.getProperty("os.name");
		if(os.toLowerCase().startsWith("win")){
			separate = SymbolConstants.DOUBLE_SLASH;
		}
		String lotteryFolder = "others";
		LotteryEnum.Lottery lottery = LotteryEnum.Lottery.getLottery(Integer.valueOf(lotteryCode));
		switch (lottery) {
			case FB:
				lotteryFolder = "jczq";
				break;
			case BB:
				lotteryFolder = "jclq";
				break;
			case BJDC:
				lotteryFolder = "bjdc";
				break;
			case SFGG:
			case JQ4:
			case ZC6:
			case ZC_NINE:
			case SFC:
				lotteryFolder = "lzc";
				break;
			default:
				break;
		}
		if(!ObjectUtil.isBlank(root)){
			sBuffer.append(root);//.append(separate)
		}
		sBuffer.append(fileType).append(separate)
		       .append(lotteryFolder).append(separate).append(uploadType).append(separate)
		       .append(DateUtil.getNow(DateUtil.FORMAT_YYYYMM)).append(separate);
		return sBuffer.toString();
	}
	
	/**
	 * 
	 * @author longguoyou
	 * @date 2017年6月16日
	 * @param basePath 文件上传根目录
	 * @param originalFileName 上传文件原始文件名
	 * 
	 * @return 按规则需存盘最终的文件
	 */
	public static File[] getFilePath(SingleUploadJCVO singleUploadJCVO, String basePath,  String originalFileName){
        long curTime = System.currentTimeMillis();
		String strTime = String.valueOf(curTime);
	    String userFile = null;//按规律定义的文件名
	    userFile = singleUploadJCVO.getUserId() + SymbolConstants.UNDERLINE + Constants.NUM_1 + SymbolConstants.UNDERLINE + singleUploadJCVO.getLotteryCode() + SymbolConstants.UNDERLINE + strTime.substring(strTime.length()-6, strTime.length());
	    singleUploadJCVO.setSecondFileName(userFile);

	    String path = FileUtil.getFilePath(basePath, FileUtil.getExtensionName(originalFileName), UploadType.getUploadType(singleUploadJCVO.getUploadType()).getShortName(), singleUploadJCVO.getLotteryCode());
	    
	    File[] file = new File[2];
	    file[0]= new File(path);
	    file[1]= new File(path + singleUploadJCVO.getSecondFileName() + SymbolConstants.DOT + FileUtil.getExtensionName(originalFileName));
		return file;
	}

	/**
	 * 复制文件
	 * @param srcFile
	 * @param destFile
	 * @throws IOException
	 */
	public static void copyFile(String srcFile,String destFile)throws IOException{
		int byteread = 0; // 读取的字节数
		InputStream in = new FileInputStream(srcFile);
		OutputStream out = new FileOutputStream(destFile);
		byte[] buffer = new byte[1024];
		while ((byteread = in.read(buffer)) != -1) {
			out.write(buffer, 0, byteread);
		}
		if (out != null) {
			out.close();
		}
		if (in != null) {
			in.close();
		}
	}



    public static void main(String[] args) {

	}
}
