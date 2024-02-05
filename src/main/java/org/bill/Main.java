package org.bill;

import org.bill.service.BillMergeFactory;
import org.bill.ui.BillDto;
import org.bill.ui.PayEnum;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		BillMergeFactory billMergeFactory = new BillMergeFactory();
		billMergeFactory.getBillMerge(PayEnum.WECHAT_PAY.getType())
				.mergeBill(new BillDto()
						.setOriginFile("D:\\个人\\流水\\2024-01\\微信支付账单(20240101-20240131)\\微信支付账单(20240101-20240131).csv")
						.setTargetFile("D:\\个人\\流水\\2024-01\\导出.xlsx"));
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