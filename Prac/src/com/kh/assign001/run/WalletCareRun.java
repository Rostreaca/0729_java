package com.kh.assign001.run;

import java.util.Scanner;

import com.kh.assign001.vo.Wallet;

public class WalletCareRun {
	public static void main(String[] args) {

		System.out.println("지갑으로 물건 사기");
		
		Scanner sc = new Scanner(System.in);
		
		boolean exit = false;
		
		Wallet wallet = new Wallet();
		
		System.out.println("각각 해당하는 정보를 적어주세요");
		System.out.print("지갑의 주인 : ");
		wallet.owner = sc.nextLine();
		System.out.print("지갑의 소재 : ");
		wallet.material = sc.nextLine();
		System.out.print("지갑의 색깔 : ");
		wallet.color = sc.nextLine();
		System.out.print("지갑에 들어있는 돈 : ");
		wallet.money = sc.nextInt();
		System.out.print("지갑 자체 무게 : ");
		wallet.weight = sc.nextInt();
		sc.nextLine();
		
		while(!exit)
		{
			System.out.println("이 지갑은" +wallet.owner+"씨의 것이며");
			System.out.println("이 지갑은"+wallet.material+"로 만들어졌고");
			System.out.println(wallet.color+"색깔이며");
			System.out.println(wallet.money+"원이 있습니다.");
			System.out.println("지갑의 무게는 " + wallet.weight + "입니다.");
			System.out.println();
			System.out.println("다음 항목을 중 하나를 선택하세요");
			System.out.println("1.물건 구입 2. 프로그램 종료");
			int menuNo = sc.nextInt();
			if(menuNo == 1) {
				wallet.buy();
			} else if(menuNo == 2)
			{
				exit = true;
			} else {
				System.out.println("잘못된 메뉴를 고르셨습니다.");
			}
		}
	}

}
