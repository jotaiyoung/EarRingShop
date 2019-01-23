package com.shop.vo;

public class EarringVO {	
		
	private String pid = "";
	private String name = "";
	private String code = ""; 
	private String category = "";
	private String type = ""; 
	private String price = ""; 
	private String contents = ""; 
	private String regist_date = "";
	
	public EarringVO() {
		// TODO Auto-generated constructor stub
	}
	
	public EarringVO(String pid, String name, String code, String category, String type, String price, String contents,
			String regist_date) {
		
		this.pid = pid;
		this.name = name;
		this.code = code;
		this.category = category;
		this.type = type;
		this.price = price;
		this.contents = contents;
		this.regist_date = regist_date;
	}

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public String getRegist_date() {
		return regist_date;
	}

	public void setRegist_date(String regist_date) {
		this.regist_date = regist_date;
	}

	
	
	
}
