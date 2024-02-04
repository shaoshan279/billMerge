package org.bill.service;

import com.sun.istack.internal.NotNull;
import com.sun.istack.internal.Nullable;
import lombok.NonNull;
import org.bill.type.AliPayBill;
import org.bill.type.WechatPayBill;
import org.bill.ui.PayEnum;
import org.ehcache.impl.internal.concurrent.ConcurrentHashMap;

import java.util.Map;

/**
 * 类描述：
 * @author 8553
 * @date 2024-02-04 16:27:10
 */
public class BillMergeFactory {

	private Map<String, BillMergeService> billMergeServiceMap = new ConcurrentHashMap<>();

	private AliPayBill aliPayBill = new AliPayBill();

	private WechatPayBill wechatPayBill = new WechatPayBill();

	public BillMergeFactory() {
		initMap();
	}

	public void initMap() {
		if (billMergeServiceMap.size() == 0) {
			billMergeServiceMap.put(PayEnum.WECHAT_PAY.getType(), wechatPayBill);
			billMergeServiceMap.put(PayEnum.ALI_PAY.getType(), aliPayBill);
		}
	}

	public BillMergeService getBillMerge(@NonNull String payType) {
		if (billMergeServiceMap.containsKey(payType)) {
			return billMergeServiceMap.get(payType);
		}
		return null;
	}
}