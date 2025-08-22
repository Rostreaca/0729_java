package com.kh.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.controller.ParkingTowerController;
import com.kh.model.vo.Car;

public class ParkingTowerView {

	private Scanner sc = new Scanner(System.in);
	private ParkingTowerController ptc = new ParkingTowerController();

	public void mainMenu() {
		while (true) {
			System.out.println("========메뉴=========");
			System.out.println("1. 차량 주차");
			System.out.println("2. 차량 출차");
			System.out.println("3. 주차된 차량 검색");
			System.out.println("4. 전체 출력");
			System.out.println("0. 프로그램 종료하기");
			System.out.print("메뉴 번호 > ");

			int menuNo = 0;
			try {
				menuNo = sc.nextInt();
				sc.nextLine();
			} catch (Exception e) {
				e.printStackTrace();
				sc.nextLine();
			}
			switch (menuNo) {
			case 1:
				insertCar();
				break;
			case 2:
				deleteCar();
				break;
			case 3:
				searchCar();
				break;
			case 4:
				selectList();
				break;
			case 0:
				System.out.println();
				return;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
			}
		}
	}

	public void insertCar() {
		System.out.print("차량번호를 입력해주십시오 > ");
		
		int carNum = 0;
		try {
		carNum = sc.nextInt();
		sc.nextLine();
		} catch(Exception e) {
			e.printStackTrace();
			sc.nextLine();
		}
		System.out.print("차종(1.경차/2.세단/3.SUV/4.트럭)을 입력해주십시오 > ");
		int carType = 0;
		try {
			carType = sc.nextInt();
			sc.nextLine();
		} catch(Exception e) {
			e.printStackTrace();
		}
		System.out.print("차량 주인의 이름을 입력해주십시오 > ");
		String owner = sc.nextLine();

		ptc.insertCar(carNum, carType, owner);

	}

	public void deleteCar() {
		System.out.print("출차할 차량의 번호를 입력해주십시오 > ");
		int carNum = 0;
		
		try {
			carNum = sc.nextInt();
			sc.nextLine();
		} catch(Exception e) {
			e.printStackTrace();
		}

		int result = ptc.deleteCar(carNum);

		if (result == 0) {
			System.out.println("차량을 찾을 수 없습니다.");
		} else {
			System.out.println("차량이 출차되었습니다.");
		}
	}

	public void searchCar() {
		System.out.print("차량 주인의 이름을 입력해주세요 > ");
		String owner = sc.nextLine();
		ArrayList<Car> cars = ptc.searchCar(owner);

		if (cars.isEmpty()) {
			System.out.println("차량이 없습니다.");
		} else {
			for (Car c : cars) {
				System.out.println(c);
			}
		}

	}

	public void selectList() {

		ArrayList<Car> cars = ptc.selectList();

		if (cars.isEmpty()) {
			System.out.println("차량이 없습니다.");
		} else {
			for (Car c : cars) {
				System.out.println(c);
			}
		}

	}

}
