package com.work.interview.designpattern.StrategyPattern.orderEnum;

public enum OrderEnum {
	Common("1","common"),
	Group("2","Group");

	private String code;
	private String name;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	OrderEnum(String code, String name) {
		this.code = code;
		this.name = name;
	}

	public String getNameByCode(String code){
		for (OrderEnum orderEnum :OrderEnum.values()){
			if (code.equals(orderEnum.getCode())){
				return orderEnum.getName();
			}
		}
		return null;
	}
}
