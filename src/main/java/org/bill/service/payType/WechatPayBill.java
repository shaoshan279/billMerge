package org.bill.service.payType;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.read.listener.PageReadListener;
import org.bill.service.AbstractBillMergeService;
import org.bill.ui.BillDto;
import org.bill.ui.PayEnum;
import org.bill.ui.WechatPayBillUI;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * 类描述：微信支付账单
 * @author lidaguang
 * @date 2024-02-04 15:41:17
 */
public class WechatPayBill extends AbstractBillMergeService {

	public WechatPayBill() {
		this.name = "微信账单";
	}

	@Override
	protected List<WechatPayBillUI> readData(BillDto billDto) {
		List<WechatPayBillUI> uis = new ArrayList<>();
		// 这里默认每次会读取100条数据 然后返回过来 直接调用使用数据就行
		// 具体需要返回多少行可以在`PageReadListener`的构造函数设置
		EasyExcel.read(billDto.getOriginFile(), WechatPayBillUI.class, new PageReadListener<WechatPayBillUI>(dataList -> {
			for (WechatPayBillUI wechatPayBillUI : dataList) {
				wechatPayBillUI.setPayType(PayEnum.WECHAT_PAY.getDesc());
				uis.add(wechatPayBillUI);
			}
		})).sheet().doRead();
		return uis;
	}

	@Override
	protected void writeExcelFile(BillDto billDto) {
		// 空数据判断
		if (!Optional.ofNullable(billDto).map(BillDto::getBills).isPresent()) {
			return;
		}
		List<WechatPayBillUI> bills = (List<WechatPayBillUI>) billDto.getBills();
		EasyExcel.write(billDto.getTargetFile(), WechatPayBillUI.class).sheet(billDto.getTargetSheet()).doWrite(bills);
	}
}