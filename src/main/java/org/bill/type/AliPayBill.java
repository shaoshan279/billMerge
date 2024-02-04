package org.bill.type;

import org.bill.service.AbstractBillMergeService;
import org.bill.ui.BillDto;
import org.bill.ui.BillUI;

/**
 * 类描述：支付宝支付账单
 * @author lidaguang
 * @date 2024-02-04 15:52:52
 */
public class AliPayBill extends AbstractBillMergeService {
	@Override
	protected BillUI readData(BillDto billDto) {
		return null;
	}
}