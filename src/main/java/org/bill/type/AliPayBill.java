package org.bill.type;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.read.listener.PageReadListener;
import org.bill.service.AbstractBillMergeService;
import org.bill.ui.AliPayBillUI;
import org.bill.ui.BillDto;
import org.bill.ui.BillUI;
import org.bill.ui.PayEnum;
import org.bill.ui.WechatPayBillUI;

import java.util.ArrayList;
import java.util.List;

/**
 * 类描述：支付宝支付账单
 * @author lidaguang
 * @date 2024-02-04 15:52:52
 */
public class AliPayBill extends AbstractBillMergeService {
	@Override
	protected List<AliPayBillUI> readData(BillDto billDto) {
		List<AliPayBillUI> uis = new ArrayList<>();
		// 这里默认每次会读取100条数据 然后返回过来 直接调用使用数据就行
		// 具体需要返回多少行可以在`PageReadListener`的构造函数设置
		EasyExcel.read(billDto.getOriginFile(), AliPayBillUI.class, new PageReadListener<AliPayBillUI>(dataList -> {
			for (AliPayBillUI aliPayBillUI : dataList) {
				aliPayBillUI.setPayType(PayEnum.ALI_PAY.getDesc());
				uis.add(aliPayBillUI);
			}
		})).sheet().doRead();
		return uis;
	}
}