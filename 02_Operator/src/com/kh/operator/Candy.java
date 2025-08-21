package com.kh.operator;
import java.util.Scanner;

public class Candy {
	

	public void PresentToStudent(){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1.사탕을 나눠줄 학생의 수를 입력해주세요:");
		int student = sc.nextInt();
		System.out.print("2.사탕 개수를 입력해주세요 :"); //총 사탕 개수
		int candy = sc.nextInt();
		
		int canGet = candy / student;
		int lastCandy = candy % student;
		
		System.out.println("학생 한 명당 받을 수 있는 사탕의 개수 :" + canGet);
		System.out.println("남은 사탕 개수 :" + lastCandy);
		
	}
}
