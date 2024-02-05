package org.bill.ui;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 类描述：
 * @author 8553
 * @date 2024-02-05 14:25:50
 */
@Getter
@Setter
@EqualsAndHashCode
public class AliPayBillUI extends BillUI{

	/**
	 * 商户
	 */
	@ExcelProperty("交易对方")
	private String businesses;

	/**
	 * 商品名
	 */
	@ExcelProperty("商品说明")
	private String tradeName;

	/**
	 * 消费所属分类  (评判标准: 对应账单系统)
	 */
	@ExcelProperty("交易分类")
	private String classify;


	/**
	 * 交易金额
	 */
	@ExcelProperty("金额")
	private BigDecimal amount;

	/**
	 * 交易状态
	 */
	@ExcelProperty("交易状态")
	private String status;

	/**
	 * 收/支
	 */
	@ExcelProperty("收/支")
	private String type;

	/**
	 * 时间
	 */
	@ExcelProperty("交易时间")
	private String time;
}