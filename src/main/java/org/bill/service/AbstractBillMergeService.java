package org.bill.service;

import org.bill.ui.BillDto;
import org.bill.ui.BillUI;

/**
 * 账单合并实现
 */
public abstract class AbstractBillMergeService implements BillMergeService{

	@Override
	public void mergeBill(BillDto billDto) {
		// 读取文件解析成对象
		BillUI billUI = readData(billDto);
		billDto.setBillUI(billUI);
		// 写入到汇总表
		writeExcelFile(billDto);
	}

	protected abstract BillUI readData(BillDto billDto);

	protected void writeExcelFile(BillDto billDto) {

	}

}