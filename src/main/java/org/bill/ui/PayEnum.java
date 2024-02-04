package org.bill.ui;

public enum PayEnum {
	WECHAT_PAY(1, "wechat", "微信支付"),
	ALI_PAY(2, "ali", "支付宝支付");
	private Integer code;

	private String type;

	private String desc;

	PayEnum() {
	}

	PayEnum(Integer code, String type, String desc) {
		this.code = code;
		this.type = type;
		this.desc = desc;
	}

	public Integer getCode() {
		return code;
	}

	public PayEnum setCode(Integer code) {
		this.code = code;
		return this;
	}

	public String getType() {
		return type;
	}

	public PayEnum setType(String type) {
		this.type = type;
		return this;
	}

	public String getDesc() {
		return desc;
	}

	public PayEnum setDesc(String desc) {
		this.desc = desc;
		return this;
	}
}
