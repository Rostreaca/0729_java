package com.kh.model.vo;

public class Restaurant {

	// 상호, 주소, 메인메뉴
	private String storeName;
	private String address;
	private String mainMenu;
	
	// 기본생성자
	// 모든 필드를 매개변수로 갖는 생성자
	// getter()
	// setter()
	// information()
	
	
	public Restaurant() {}
	public Restaurant(String storeName, String address, String mainMenu){
		this.storeName = storeName;
		this.address = address;
		this.mainMenu = mainMenu;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	public String getStoreName() {
		return storeName;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress() {
		return address;
	}
	public void setMainMenu(String mainMenu) {
		this.mainMenu = mainMenu;
	}
	public String getMainMenu() {
		return mainMenu;
	}
	
	public String information() {
		String info = "[상호 : " + storeName + ", 주소 : "+ address+", 메인 메뉴 : "+ mainMenu+"]";
		return info;
	}
	
	/*
	public void information() {
		System.out.println("상호 : "+ storeName);
		System.out.println("주소 : "+ address);
		System.out.println("메인 메뉴 : "+ mainMenu);
	}
	*/
	
}
