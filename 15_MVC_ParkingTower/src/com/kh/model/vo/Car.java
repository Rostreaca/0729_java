package com.kh.model.vo;

public class Car {

	private int parkingNum; //????
	private int carNum;
	private int carType;
	private String owner;
	public Car() {
		super();
	}
	public Car(int parkingNum, int carNum, int carType, String owner) {
		super();
		this.parkingNum = parkingNum;
		this.carNum = carNum;
		this.carType = carType;
		this.owner = owner;
	}
	public int getParkingNum() {
		return parkingNum;
	}
	public void setParkingNum(int parkingNum) {
		this.parkingNum = parkingNum;
	}
	public int getCarNum() {
		return carNum;
	}
	public void setCarNum(int carNum) {
		this.carNum = carNum;
	}
	public int getCarType() {
		return carType;
	}
	public void setCarType(int carType) {
		this.carType = carType;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	@Override
	public String toString() {
		
		String carTypeName = "";
		if(this.carType == 1) {
			carTypeName = "경차";
		} else if(this.carType == 2) {
			carTypeName = "세단";
		} else if(this.carType == 3) {
			carTypeName = "SUV";
		} else if(this.carType == 4 ) {
			carTypeName = "트럭";
		}
		return "Car [parkingNum=" + parkingNum + ", carNum=" + carNum + ", carType=" + carTypeName + ", owner=" + owner
				+ "]";
	}
	
	
	
	
}
