package com.kh.assign001.run;

import java.util.Scanner;

import com.kh.assign001.vo.Car;

public class CarCareRun {

	public static void main(String[] args) {

		System.out.println("자동차 관리하기");

		Scanner sc = new Scanner(System.in);

		boolean exit = false;

		Car car = new Car();

		System.out.print("차종을 입력해주세요 > ");
		String name = sc.nextLine();
		car.setModelName(name);
		System.out.print("차 크기를 입력해주세요 > ");
		String size = sc.nextLine();
		car.setSize(size);
		System.out.print("차에 있는 기름 양을 입력해주세요 > ");
		int nowFuel = sc.nextInt();
		car.setNowFuel(nowFuel);
		System.out.print("차의 최대 기름량을 적어주세요 > ");
		int maxFuel = sc.nextInt();
		car.setMaxFuel(maxFuel);
		System.out.print("차에 최대로 탈 수 있는 사람 수 를 적어주세요 > ");
		int maxPerson = sc.nextInt();
		car.setMaxPerson(maxPerson);
		sc.nextLine();

		System.out.println(car.info());
		
		while (!exit) {
			System.out.println(car.getModelName() + "의 정보");
			System.out.println("차의 크기 : " + car.getSize() + "형입니다");
			System.out.println("현재 차에 남아있는 기름은 " + car.getNowFuel() + " L입니다.");
			System.out.println("차의 최대 기름량은 " + car.getMaxFuel() + " L입니다.");
			System.out.println("이 차에는 최대 " + car.getMaxPerson() + "명 까지 탈 수 있습니다.");
			System.out.println();

			System.out.println("항목을 선택해주십시오.");
			System.out.println("1.차를 운전하시겠습니까?");
			System.out.println("2.연료를 가득 채우시겠습니까?");
			System.out.println("3.그만하시겠습니까?");
			int menuNo = sc.nextInt();
			sc.nextLine();

			switch (menuNo) {
			case 1:
				car.drive();
				break;
			case 2:
				car.chargeFuel();
				break;
			case 3:
				exit = true;
				break;
				default: System.out.println("없는 항목입니다. 다시 선택해주십시오.");
			}

		}

	}

}
