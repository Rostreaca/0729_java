package com.kh.assign001.vo;

public class Clothes {

	private String type; // 옷의 종류
	private String texture; // 재질
	private int price; // 가격
	private String size; // 사이즈
	private String color; // 옷의 색깔

	public Clothes() {

	}

	public Clothes(String type, String texture, int price, String size, String color) {
		this.type = type;
		this.texture = texture;
		this.price = price;
		this.size = size;
		this.color = color;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public void setTexture(String texture) {
		this.texture = texture;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getType() {
		return type;
	}
	public String getTexture() {
		return texture;
	}
	public int getPrice() {
		return price;
	}
	public String getSize() {
		return size;
	}
	public String getColor() {
		return color;
	}
	
	public String info()
	{
		String info = "옷 종류 : " +type + "옷 재질 : " + texture + 
				"옷 가격 : "+price + "옷 크기 : " +size + "옷 색깔 : "+color;
		return info;
	}
	
	public void salePrice() {
		if (price > 1000) {
			System.out.println(type + "의 가격이 1000원 할인되었습니다.");
			price -= 1000;
		} else {
			System.out.println("현재 최소가격입니다.");
		}
	}
}
