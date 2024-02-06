package org.bill.ui;

import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * 类描述：
 * @author 8553
 * @date 2024-02-04 17:32:23
 */
@Data
@Accessors(chain = true)
@ToString
public class BillDto {

	/**
	 * 输入文件
	 */
	private String originFile;

	/**
	 * 输出文件路径
	 */
	private String targetFile;

	/**
	 * 输出文件sheet
	 */
	private String targetSheet;

	/**
	 * 账单数据
	 */
	private List<? extends BillUI> bills;

}