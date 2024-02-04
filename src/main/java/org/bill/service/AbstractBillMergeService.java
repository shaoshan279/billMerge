package org.bill.service;

import org.bill.ui.BillDto;
import org.bill.ui.BillUI;

/**
 * 账单合并实现
 */
public abstract class AbstractBillMergeService implements BillMergeService{

	@Override
	public void mergeBill(BillDto billDto) {
		BillUI billUI = readData(billDto);

	}

	protected abstract BillUI readData(BillDto billDto);

	protected void writeExcelFile(BillDto billDto) {

	}

}