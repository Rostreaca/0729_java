package com.kh.assign001.run;

import java.util.Scanner;

import com.kh.assign001.vo.House;

public class HouseCareRun {
	public static void main(String[] args) {
		
		System.out.println("맨땅에 집사기");
		
		Scanner sc = new Scanner(System.in);
		
		House house = new House();
		
		System.out.print("집의 도로명주소 > ");
		house.address = sc.nextLine();
		System.out.print("집의 평수 > ");
		house.size = sc.nextInt();
		System.out.print("집의 방 개수 > ");
		house.rooms = sc.nextInt();
		sc.nextLine();
		System.out.print("집의 재질 > ");
		house.material = sc.nextLine();
		System.out.print("집의 가격 > ");
		house.price = sc.nextInt();
		sc.nextLine();
		System.out.print("집을 소유하고 있습니까?(Y/N) > " );
		char ownCheck = sc.nextLine().charAt(0);
		if(ownCheck == 'Y' || ownCheck == 'y')house.isOwned = true;
		else if(ownCheck == 'N' || ownCheck == 'n') house.isOwned = false;
		
		boolean exit = false;
		
		while(!exit)
		{
			System.out.println("집 도로명주소 :" + house.address);
			System.out.println("집 평수 : "+house.size + "평");
			System.out.println("집 방 개수 : " + house.rooms+ "개");
			System.out.println("집 재질 : " +house.material);
			System.out.println("집 가격 : " +house.price);
			System.out.println("집 소유 여부 : "  +house.isOwned);
			
			System.out.println();
			System.out.println("다음 항목 중 선택해주세요");
			System.out.println("1.집 구매  2. 프로그램 종료");
			int menuNo = sc.nextInt();
			switch(menuNo)
			{
			case 1: house.buy(); break;
			case 2: exit = true; break;
			default : System.out.println("해당하는 명령이 없습니다.");
			}
			
		}
		
		
	}
	
}
