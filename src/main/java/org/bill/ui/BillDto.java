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

	private String originFile;

	private String targetFile;

	private List<? extends BillUI> bills;

}