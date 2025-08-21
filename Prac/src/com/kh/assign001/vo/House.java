package com.kh.assign001.vo;

public class House {

	private String address;
	private int size;
	private int rooms;
	private String material;
	private int price;
	private boolean isOwned;

	public House() {
		
	}
	
	public House(String address, int size, int rooms, String material, int price, boolean isOwned) {
		this.address = address;
		this.size = size;
		this.rooms = rooms;
		this.material = material;
		this.price = price;
		this.isOwned = isOwned;
	}
	
	
	
	
	
	
	
	
	public void buy() {
		if (!isOwned) {
			System.out.println("이 집을 구매하셨습니다.");
			isOwned = true;
		} else {
			System.out.println("이미 소유한 집입니다.");
		}
	}
}
