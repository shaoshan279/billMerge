package org.bill.ui;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 输出表格实体
 */
@Data
@EqualsAndHashCode
@Accessors(chain = true)
public class BillUI implements Serializable {
	private static final long serialVersionUID = 3629802194268286134L;

	/**
	 * 支付方式
	 * @see PayEnum
	 */
	@ExcelProperty("渠道")
	private String payType;

//	/**
//	 * 商户
//	 */
//	@ExcelProperty("交易对方")
//	private String businesses;
//
//	/**
//	 * 交易金额
//	 */
//	@ExcelProperty("金额")
//	private BigDecimal amount;
//
//	/**
//	 * 交易状态
//	 */
//	@ExcelProperty("交易状态")
//	private String status;
//
//	/**
//	 * 收/支
//	 */
//	@ExcelProperty("收/支")
//	private String type;
//
//	/**
//	 * 时间
//	 */
//	@ExcelProperty("交易时间")
//	private Date time;
}