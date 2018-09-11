package com.hhly.skeleton.base.log;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSONObject;
import com.hhly.skeleton.base.exception.ServiceRuntimeException;
import com.hhly.skeleton.base.log.entity.ILog;
import com.hhly.skeleton.base.log.visit.IVisitor;

/**
 * @desc 日志分析处理类
 * @author jiangwei
 * @date 2017年3月2日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public abstract class LogHandler {
	
	/**
	 * 分析日志记录（日志记录必须问实体json）格式：LogEnum{json}
	 * 如：2017-03-02 16:42:34,376 INFO [pool-2-thread-9] [com.hhly.taskcore.base.thread.ThreadPoolManager-monitor] - 
	 * LOG_THREAD_POOL{"activeCount":0,"completedTaskCount":4,"maximumPoolSize":15,"name":"THREAD_POOL",,"taskCount":4}
	 * @author jiangwei
	 * @Version 1.0
	 * @CreatDate 2017年3月2日 下午4:56:37
	 * @param logEnum 日志类型
	 * @param fileUrl 文件地址
	 * @param cla 日志实体类
	 * @param visitor 过滤器
	 * @return
	 */
	public static   <T extends ILog> List<T>  analysisLog(LogEnum logEnum,String fileUrl,Class<T> cla,IVisitor visitor){
		Path path  = Paths.get(fileUrl);
		String type = logEnum.name();
		List<T> pos  = new ArrayList<>();
		try(BufferedReader reader = Files.newBufferedReader(path, StandardCharsets.UTF_8)){
			String str = null;
			while((str = reader.readLine()) != null){
				if(str.indexOf(type) != -1){
					String [] logs= str.split(type);
					if(logs.length == 2){
						T bo = JSONObject.parseObject(logs[1],cla);
						if(bo.visit(visitor)){
							pos.add(bo);	
						}
					}
				}
			}
		} catch (IOException e) {
			throw new ServiceRuntimeException("get LOG_RUNNABLE error", e);
		}
		return pos;
	}
}
