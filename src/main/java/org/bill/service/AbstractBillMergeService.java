package org.bill.service;

import org.bill.ui.BillDto;
import org.bill.ui.BillUI;

import java.util.List;

/**
 * 账单合并实现
 */
public abstract class AbstractBillMergeService implements BillMergeService {

	// 账单类型 (名称)
	protected String name;

	@Override
	public void mergeBill(BillDto billDto) {
		// 读取文件解析成对象
		List<? extends BillUI> billUIS = readData(billDto);
		billDto.setBills(billUIS);
		// 写入到汇总表
		writeExcelFile(billDto);
	}

	protected abstract List<? extends BillUI> readData(BillDto billDto);

	protected abstract void writeExcelFile(BillDto billDto);

	public String getName() {
		return name;
	}
}