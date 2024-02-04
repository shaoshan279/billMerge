package org.bill.service;

import org.bill.ui.BillUI;

import java.io.File;

/**
 * 账单合并实现
 */
public abstract class AbstractBillMergeService implements BillMergeService{

	@Override
	public void mergeBill() {

	}

	protected abstract BillUI readData(File file);

	protected void writeExcelFile() {

	}

}