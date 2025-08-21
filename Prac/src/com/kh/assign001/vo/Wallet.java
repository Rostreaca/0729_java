package com.kh.assign001.vo;

public class Wallet {

	public String owner;
	public String material;
	public String color;
	public int money;
	public int weight;
	
	public void buy()
	{
		if(money >= 4000)
		{
			System.out.println("4000원짜리 물건을 구입하셨습니다.");
			money -= 4000;
		} else {
			System.out.println("돈이 없습니다.");
		}
		
	}
}
