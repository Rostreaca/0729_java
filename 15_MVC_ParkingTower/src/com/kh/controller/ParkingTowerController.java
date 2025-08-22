package com.kh.controller;

import java.util.ArrayList;

import com.kh.model.vo.Car;

public class ParkingTowerController {

	private ArrayList<Car> carList = new ArrayList();
	
	public void insertCar(int carNum, int carType, String owner) {
		
		carList.add(new Car(carList.size(),carNum,carType,owner));
		
	}
	public int deleteCar(int carNum) {
		
		
		for(int i=0;i<carList.size();i++) {
			if(carList.get(i).getCarNum() == carNum) {
				carList.remove(i);
				return 1;
			}
		}
		
		return 0;
	}
	
	public ArrayList<Car> searchCar(String owner){
		
		ArrayList<Car> cars = new ArrayList();
		
		for(int i=0; i<carList.size();i++) {
			if(carList.get(i).getOwner().equals(owner)) {
				cars.add(carList.get(i));
			}
		}
		
		return cars;
		
		
	}
	public ArrayList<Car> selectList(){
		
		return carList;
		
	}
	
}
