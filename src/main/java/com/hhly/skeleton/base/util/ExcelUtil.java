package com.hhly.skeleton.base.util;

import com.hhly.skeleton.base.excel.ExcelHeader;
import com.hhly.skeleton.base.excel.ExcelIgnore;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.write.*;
import jxl.write.biff.RowsExceededException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.web.multipart.MultipartFile;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author jiangwei
 * @Version 1.0
 * @CreatDate 2016-11-22 上午10:46:07
 * @Desc excel 工具类
 */
public class ExcelUtil {
	/**
	 * 读取excel
	 * 
	 * @param path
	 * @param col
	 *            列
	 * @return
	 */
	public static List<List<String>> readExcel(String path, int col) {
		List<List<String>> lists = new ArrayList<List<String>>();
		try {

			Workbook book = Workbook.getWorkbook(new File(path));
			// 获得第一个工作表对象
			Sheet sheet = book.getSheet(0);
			// 读取每一行对应的每一列
			int row = sheet.getRows();
			for (int i = 0; i < row; i++) {
				List<String> rows = new ArrayList<String>();
				for (int j = 0; j < col; j++) {
					Cell cell1 = sheet.getCell(j, i);
					String result = cell1.getContents();
					rows.add(result);
				}
				lists.add(rows);
			}

			book.close();
		} catch (Exception e) {
			throw new RuntimeException("导入excel 失败");
		}
		return lists;
	}
	
	public static List<List<String>> readExcel(MultipartFile multipartFile) {
		//		Assert.isTrue(originalFilename.endsWith(".xls") || originalFilename.endsWith(".xlsx"), "请上传excel文件");
		List<List<String>> list = new ArrayList<List<String>>();
		if(multipartFile.getOriginalFilename().endsWith(".xlsx")) {
			try {
				// 构造 XSSFWorkbook 对象，strPath 传入文件路径
				@SuppressWarnings("deprecation")
				XSSFWorkbook xwb = new XSSFWorkbook(multipartFile.getInputStream());
				// 读取第一章表格内容
				XSSFSheet sheet = xwb.getSheetAt(0);
				// 定义 row、cell
				XSSFRow row;
				String cell;
				// 循环输出表格中的内容
				for (int i = sheet.getFirstRowNum(); i < sheet.getPhysicalNumberOfRows(); i++) {
					row = sheet.getRow(i);
					List<String> sList = new ArrayList<String>();
					for (int j = row.getFirstCellNum(); j < row.getPhysicalNumberOfCells(); j++) {
						// 通过 row.getCell(j).toString() 获取单元格内容，
						cell = row.getCell(j).toString().trim();
						sList.add(cell);
					}
					list.add(sList);
				}
			} catch (Exception e) {
				e.printStackTrace();
				list = null;
				throw new RuntimeException("导入excel 失败1");
			}
		} else {
			try {
				Workbook book = Workbook.getWorkbook(multipartFile.getInputStream());
				// 获得第一个工作表对象
				Sheet sheet = book.getSheet(0);
				// 读取每一行对应的每一列
				int row = sheet.getRows();
				int col = sheet.getColumns();
				for (int i = 0; i < row; i++) {
					List<String> rows = new ArrayList<String>();
					for (int j = 0; j < col; j++) {
						Cell cell1 = sheet.getCell(j, i);
						String result = cell1.getContents();
						rows.add(result);
					}
					list.add(rows);
				}
				book.close();
			} catch (Exception e) {
				e.printStackTrace();
				list = null;
				throw new RuntimeException("导入excel 失败2");
			}
		}
		return list;
	}

	/**
	 * 读取excel，支持2007版excel
	 * 
	 * @param path
	 * @return
	 */
	public static List<List<String>> readExcel2007(String path) {
		List<List<String>> list = new ArrayList<List<String>>();
		try {
			// 构造 XSSFWorkbook 对象，strPath 传入文件路径
			@SuppressWarnings("deprecation")
			XSSFWorkbook xwb = new XSSFWorkbook(path);
			// 读取第一章表格内容
			XSSFSheet sheet = xwb.getSheetAt(0);
			// 定义 row、cell
			XSSFRow row;
			String cell;
			// 循环输出表格中的内容
			for (int i = sheet.getFirstRowNum(); i < sheet.getPhysicalNumberOfRows(); i++) {
				row = sheet.getRow(i);
				List<String> sList = new ArrayList<String>();
				for (int j = row.getFirstCellNum(); j < row.getPhysicalNumberOfCells(); j++) {
					// 通过 row.getCell(j).toString() 获取单元格内容，
					cell = row.getCell(j).toString().trim();
					sList.add(cell);
				}
				list.add(sList);
			}
		} catch (Exception e) {
			list = null;
			e.printStackTrace();
			throw new RuntimeException("读取excel 失败");
		}
		return list;
	}

	/**
	 * 数据通过流的方式导出excel到页面
	 * 
	 * @param data
	 *            导入数据 （集合中的对象属性必须是基本数据类型,list的集合对象需要在属性上添加ExcelHeader注解）
	 * @return
	 */
	public static <T> ByteArrayOutputStream dataToExeclByStream(Map<String, List<T>> data) {
		ByteArrayOutputStream outStream = new ByteArrayOutputStream();
		dataToExeclByStream(data,outStream);
		return outStream;
	}
	
	/**
	 * 数据通过流的方式导出excel到流
	 * 
	 * @param outStream
	 *            excel页名
	 * @param data
	 *            导入数据 （集合中的对象属性必须是基本数据类型,list的集合对象需要在属性上添加ExcelHeader注解）
	 * @return
	 */
	public static <T> void dataToExeclByStream(Map<String, List<T>> data, OutputStream outStream) {
		if (data == null || data.isEmpty()) {
			return;
		}
		WritableWorkbook wwb = null;
		try {
			wwb = Workbook.createWorkbook(outStream);
			int i = 0;
			for (Map.Entry<String, List<T>> entry : data.entrySet()) {
				List<T> sheetData = entry.getValue();
				if(sheetData == null || sheetData.isEmpty()){
					continue;
				}
				WritableSheet ws = wwb.createSheet(entry.getKey(), i++);
				// 获取属性集合
				Field[] fields = sheetData.get(0).getClass().getDeclaredFields();
				List<Field> fieldList = new ArrayList<>();
				for (Field field : fields) {
					// 去除不需要导出的字段
					if(field.isAnnotationPresent(ExcelIgnore.class)) {
						continue;
					}
					fieldList.add(field);
				}
				Field[] excelFields = fieldList.toArray(new Field[fieldList.size()]);
				addExcelHeader(ws, excelFields);
				addExcelContent(sheetData , ws, excelFields);
			}
			wwb.write();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (wwb != null) {
				try {
					wwb.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

	/**
	 * 解析excel 类容
	 * 
	 * @author jiangwei
	 * @Version 1.0
	 * @CreatDate 2017-1-19 下午4:10:29
	 * @param data
	 *            数据
	 * @param ws
	 *            excel 对象
	 * @param fields
	 *            属性
	 * @throws IllegalAccessException
	 * @throws WriteException
	 * @throws RowsExceededException
	 */
	private static void addExcelContent(List<?> data, WritableSheet ws, Field[] fields)
			throws IllegalAccessException, WriteException, RowsExceededException {
		for (Field field : fields) {
			field.setAccessible(true);
		}
		for (int i = 0; i < data.size(); i++) {
			Object obj = data.get(i);
			for (int j = 0; j < fields.length; j++) {
				Object value = fields[j].get(obj);
				WritableCell label = createCell(j, i + 1, value);
				ws.addCell(label);
			}
		}
	}

	/**
	 * 根据数据类型创建cell
	 * 
	 * @author jiangwei
	 * @Version 1.0
	 * @CreatDate 2017-2-5 上午10:04:41
	 * @param cell
	 * @param row
	 * @param value
	 * @return
	 */
	private static WritableCell createCell(int cell, int row, Object value) {
		WritableCell label;
		if (value instanceof Double) {
			label = new jxl.write.Number(cell, row, (double) value);
		} else if (value instanceof Date) {
			Date date = (Date) value;
			String str = DateUtil.convertDateToStr(date);
			label = new Label(cell, row, str);
		} else {
			String str = value == null ? "" : value.toString();
			label = new Label(cell, row, str);
		}
		return label;
	}

	/**
	 * 解析excel 头部
	 * 
	 * @author jiangwei
	 * @Version 1.0
	 * @CreatDate 2017-1-19 下午4:10:00
	 * @param ws
	 *            excel 对象
	 * @param fields
	 *            属性
	 * @throws RowsExceededException
	 * @throws WriteException
	 */
	private static void addExcelHeader(WritableSheet ws, Field[] fields) throws RowsExceededException, WriteException {
		for (int i = 0; i < fields.length; i++) {
			ExcelHeader header = fields[i].getAnnotation(ExcelHeader.class);
			String title = header == null ? "" : header.value();
			Label label = new Label(i, 0, title);
			ws.addCell(label);
		}
	}
}
