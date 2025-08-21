package com.kh.assign001.vo;

public class Car {

	private String modelName; // 차종
	private String size; // 차 크기 (대, 중, 소)
	private int nowFuel; // 현재 기름량
	private int maxFuel; // 최대 기름 용량
	private int maxPerson; // 최대 탑승자 수

	public Car() {
		
	}
	
	public Car(String modelName, String size, int nowFuel, int maxFuel, int maxPerson){
		this.modelName = modelName;
		this.size = size;
		this.nowFuel = nowFuel;
		this.maxFuel = maxFuel;
		this.maxPerson = maxPerson;
	}
	
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public void setNowFuel(int nowFuel) {
		this.nowFuel = nowFuel;
	}

	public void setMaxFuel(int maxFuel) {
		this.maxFuel = maxFuel;
	}

	public void setMaxPerson(int maxPerson) {
		this.maxPerson = maxPerson;
	}

	public String getModelName() {
		return modelName;
	}

	public String getSize() {
		return size;
	}
	public int getNowFuel() {
		return nowFuel;
	}
	
	public int getMaxFuel() {
		return maxFuel;
	}
	
	public int getMaxPerson() {
		return maxPerson;
	}
	
	public String info() {
		return "모델명 : " +modelName + "차 크기 : " + size + 
				"현재 기름량: " + nowFuel + "최대 용량 : " + maxFuel + "최대 인원 수 : " + maxPerson; 
	}
	
	
	public void drive() {
		if (nowFuel >= 5) {
			System.out.println("주행을 시작합니다.");
			nowFuel -= 5;
		} else {
			System.out.println("연료가 부족합니다.");
		}

	}

	public void chargeFuel() {
		if (nowFuel != maxFuel) {
			System.out.println("연료를 충전합니다.");
			nowFuel = maxFuel;
		} else {
			System.out.println("이미 연료가 가득찼습니다.");
		}

	}

}
