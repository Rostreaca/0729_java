package com.kh.variable;

public class A_Variable {

	
	public void findSeasonMenu()
	{
		String seasonMenu = "딸기라떼";
		int Price = 6700;
		
		/*
		 * System.out.println("---변수를 사용하기 전---"); System.out.println("시즌메뉴 : ");
		 * System.out.println("1.딸기라떼(6700)");
		 * System.out.println("2. 요거 젤리 소다 플랫치노(3900)");
		 * System.out.println("3. 케로케로케로피 멜론라떼(4200)");
		 */
		
		
//		System.out.println("------------");
//		System.out.println("딸기라떼를 25잔 시키셨습니다");
//		System.out.print(6700*25);
//		System.out.println("원입니다");
		
		/*
		 * System.out.println("케로케로케로피 멜론라떼를 30잔 시키셨습니다"); System.out.println((4200 *
		 * 30) + "원입니다");
		 */
		
		
		System.out.println("메뉴명 : 1." + seasonMenu);
		System.out.println("가격" + Price);
		System.out.println(seasonMenu + "를 17개 시켰니?");
		System.out.println((Price*17)+ "원입니다");
		System.out.println(seasonMenu + "를 12개 시켰니?");
		System.out.println((Price*12)+ "원입니다");
	}
	
	public void declareVariable()
	{
		
	}
}
