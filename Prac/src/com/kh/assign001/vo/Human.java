package com.kh.assign001.vo;

public class Human {

	public String name; 
	public int age; 
	public int height; 
	public int weight; 
	public String gender; 
	
	public void Exercise()
	{
		if(weight > 55)
		{
			System.out.println("운동을 시작합니다.");
			weight -= 5;
		} else {
			System.out.println("운동을 할 필요가 없습니다.");
		}
		
	}
}
