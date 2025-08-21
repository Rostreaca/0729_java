package com.kh.assign001.run;

import java.util.Scanner;

import com.kh.assign001.vo.Clothes;

public class ClothesCareRun {
	public static void main(String[] args) {

		System.out.println("옷 찾기");

		Scanner sc = new Scanner(System.in);

		boolean exit = false;

		Clothes clothes = new Clothes();

		System.out.println("옷의 정보를 적어주세요");
		System.out.print("옷의 종류 > ");
		clothes.setType(sc.nextLine());
		System.out.print("옷의 재질 > ");
		clothes.setTexture(sc.nextLine());
		System.out.print("옷의 가격 > ");
		clothes.setPrice(sc.nextInt());
		sc.nextLine();
		System.out.print("옷 사이즈 > ");
		clothes.setSize(sc.nextLine());
		System.out.print("옷 색깔 > ");
		clothes.setColor(sc.nextLine());
		System.out.println(clothes.info());
		
		while (!exit) {
			System.out.println("고르신 " + clothes.getType() + "의 정보");
			System.out.println("옷의 재질은 " + clothes.getTexture() + "입니다");
			System.out.println("옷의 가격은 " + clothes.getPrice() + " 입니다.");
			System.out.println("옷의 사이즈는 " + clothes.getSize() + " 입니다.");
			System.out.println("옷의 색깔은 " + clothes.getColor() + "입니다.");
			System.out.println();

			System.out.println("다음 중 선택해 주십시오.");
			System.out.println("1.가격할인받기 2.프로그램 종료");
			int menuNo = sc.nextInt();
			sc.nextLine();

			switch (menuNo) {
			case 1:
				clothes.salePrice();
				break;
			case 2:
				exit = true;
				break;
			default:
				System.out.println("없는 항목입니다. 다시 선택해주십시오.");
			}

		}

	}
}
