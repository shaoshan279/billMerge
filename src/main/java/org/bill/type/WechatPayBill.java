package org.bill.type;

import org.bill.service.AbstractBillMergeService;
import org.bill.ui.BillDto;
import org.bill.ui.BillUI;

/**
 * 类描述：微信支付账单
 * @author lidaguang
 * @date 2024-02-04 15:41:17
 */
public class WechatPayBill extends AbstractBillMergeService {
	@Override
	protected BillUI readData(BillDto billDto) {
		// todo 微信文件解析
		return null;
	}
}