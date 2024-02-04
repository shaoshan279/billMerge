package org.bill.service;

import org.bill.ui.BillDto;

/**
 * 合并账单方法接口
 */
public interface BillMergeService {
	void mergeBill(BillDto billDto);
}
