package org.bill.type;

import org.bill.service.AbstractBillMergeService;
import org.bill.ui.BillUI;

import java.io.File;

/**
 * 类描述：微信支付账单
 * @author lidaguang
 * @date 2024-02-04 15:41:17
 */
public class WechatPayBill extends AbstractBillMergeService {
	@Override
	protected BillUI readData(File file) {
		return null;
	}
}