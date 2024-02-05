package org.bill.service;

import org.bill.ui.BillDto;
import org.bill.ui.BillUI;

import java.util.List;
import java.util.Optional;

/**
 * 账单合并实现
 */
public abstract class AbstractBillMergeService implements BillMergeService {

	@Override
	public void mergeBill(BillDto billDto) {
		// 读取文件解析成对象
		List<? extends BillUI> billUIS = readData(billDto);
		billDto.setBills(billUIS);
		// 写入到汇总表
		writeExcelFile(billDto);
	}

	protected abstract List<? extends BillUI> readData(BillDto billDto);

	protected void writeExcelFile(BillDto billDto) {
		// 空数据判断
		if (!Optional.ofNullable(billDto).map(BillDto::getBills).isPresent()) {
			return;
		}
		List<? extends BillUI> bills = billDto.getBills();


	}

}