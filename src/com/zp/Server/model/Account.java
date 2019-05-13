package com.zp.Server.model;

public class Account {

	private String AccountNum;	//账户
	private String UserID; 		//所属用户
	private String Plaform;		//所属平台
	private String State;		//状态
	private String Language;	//语言
	private String Type;		//类型
	private String UseState;	//使用状态
	private String phone;		//手机
	private String MainPage;	//个人主页
	private String Region;    //地址

	public String getMain_page() {
		return MainPage;
	}

	public void setMain_page(String main_page) {
		MainPage = main_page;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAccountNum() {
		return AccountNum;
	}
	public void setAccountNum(String accountNum) {
		AccountNum = accountNum;
	}
	public String getUserID() {
		return UserID;
	}
	public void setUserID(String userID) {
		UserID = userID;
	}
	public String getPlaform() {
		return Plaform;
	}
	public void setPlaform(String plaform) {
		Plaform = plaform;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getLanguage() {
		return Language;
	}
	public void setLanguage(String language) {
		Language = language;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	public String getUseState() {
		return UseState;
	}
	public void setUseState(String useState) {
		UseState = useState;
	}
	public String getRegion() {
		return Region;
	}
	public void setRegion(String region) {
		Region = region;
	}
	public Account(String plaform, String language, String userID, String state, String useState, String accountNum, String phone, String Main_page) {
		super();
		AccountNum = accountNum;
		UserID = userID;
		Plaform = plaform;
		State = state;
		Language = language;
		UseState = useState;
		this.phone=phone;
		this.MainPage=Main_page;
	}
	
	public Account() {
		super();
	}
	public Account(String accountNum, String userID, String plaform, String state, String language, String type,
                   String useState) {
		super();
		AccountNum = accountNum;
		UserID = userID;
		Plaform = plaform;
		State = state;
		Language = language;
		Type = type;
		UseState = useState;
		
	}

//	public Account(String accountNum, String userID, String plaform, String state, String language, String type, String useState, String phone, String main_page, String region) {
//		AccountNum = accountNum;
//		UserID = userID;
//		Plaform = plaform;
//		State = state;
//		Language = language;
//		Type = type;
//		UseState = useState;
//		this.phone = phone;
//		MainPage = main_page;
//		Region = region;
//	}

	@Override
	public String toString() {
		return "Account [AccountNum=" + AccountNum + ", UserID=" + UserID + ", Plaform=" + Plaform + ", State=" + State
				+ ", Language=" + Language + ", Type=" + Type + ", UseState=" + UseState + ", phone=" + phone
				+ ", Main_page=" + MainPage + "]";
	}

	public String toString2() {
		return "Account{" +
				"AccountNum='" + AccountNum + '\'' +
				", UserID='" + UserID + '\'' +
				", Plaform='" + Plaform + '\'' +
				", State='" + State + '\'' +
				", Language='" + Language + '\'' +
				", Type='" + Type + '\'' +
				", UseState='" + UseState + '\'' +
				", phone='" + phone + '\'' +
				", Main_page='" + MainPage + '\'' +
				", Region='" + Region + '\'' +
				'}';
	}
}
