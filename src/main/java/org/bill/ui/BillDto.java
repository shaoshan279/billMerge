package org.bill.ui;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 类描述：
 * @author 8553
 * @date 2024-02-04 17:32:23
 */
@Data
@Accessors(chain = true)
public class BillDto {

	private String originFile;

	private String targetFile;

	private BillUI billUI;

}