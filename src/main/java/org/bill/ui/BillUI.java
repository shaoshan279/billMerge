package org.bill.ui;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 输出表格实体
 */
@Data
@Accessors(chain = true)
public class BillUI implements Serializable {
	private static final long serialVersionUID = 3629802194268286134L;

	/**
	 * 支付方式
	 * @see PayEnum
	 */
	private String payType;

	/**
	 * 商户
	 */
	private String businesses;

	/**
	 * 商品名
	 */
	private String tradeName;

	/**
	 * 消费所属分类  (评判标准: 对应账单系统)
	 */
	private String classify;

	/**
	 * 交易详情
	 */
	private String tradeInfo;

	/**
	 * 交易金额
	 */
	private BigDecimal amount;

	/**
	 * 收/支
	 */
	private String type;
}