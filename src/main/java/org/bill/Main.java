package org.bill;

import org.bill.service.BillMergeFactory;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		BillMergeFactory billMergeFactory = new BillMergeFactory();
	}


	/**
	 * 方法描述:获取文件目录下所有文件
	 * @param filePath 文件路径
	 * @param suffix 指定格式
	 * @return {@link List< File>}
	 * @throws
	 * @date 2024-02-04 17:34:59
	*/
	private List<File> getFiles(String filePath, String suffix) {
		List<File> fileList = new ArrayList<>();
		File dirPath = new File(filePath);
		if (Files.isDirectory(Paths.get(dirPath.getPath()))) {
			// todo 获取目录下所有csv文件
		} else {
			fileList.add(dirPath);
		}
		return fileList;
	}

}