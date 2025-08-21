package com.kh.assign001.run;

import java.util.Scanner;

import com.kh.assign001.vo.Human;


public class HumanCareRun {
	public static void main(String[] args) {

		System.out.println("사람 정보 확인");

		Scanner sc = new Scanner(System.in);

		boolean exit = false;

		Human human = new Human();

		System.out.println("찾는 사람에 대해 검색해주세요");
		System.out.print("이름 > ");
		human.name = sc.nextLine();
		System.out.print("나이 > ");
		human.age = sc.nextInt();
		System.out.print("신장 > ");
		human.height = sc.nextInt();
		System.out.print("체중 > ");
		human.weight = sc.nextInt();
		sc.nextLine();
		System.out.print("성별 > ");
		human.gender = sc.nextLine();

		while (!exit) {
			System.out.println("찾으신 "+human.name + "씨는");
			System.out.println(human.age + "살 이며,");
			System.out.println("키는 " + human.height + " 입니다.");
			System.out.println("체중은 " + human.weight + " 입니다.");
			System.out.println("성별은 " + human.gender + "입니다.");
			System.out.println();

			System.out.println("다음 중 선택해 주십시오.");
			System.out.println("1.운동하기 2.프로그램 종료");
			
			int menuNo = sc.nextInt();
			sc.nextLine();

			switch (menuNo) {
			case 1:
				human.Exercise();
				break;
			case 2:
				exit = true;
				break;
				default: System.out.println("없는 항목입니다. 다시 선택해주십시오.");
			}

		}

	}
	
	
}
