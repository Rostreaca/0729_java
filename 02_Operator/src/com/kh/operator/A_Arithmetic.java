package com.kh.operator;

public class A_Arithmetic {

	// 산술연산자 -> 이항연산자, 우선순위 = 수학이랑 같음
	// + : 덧셈
	// - : 뺄셈
	// * : 곱셈
	// / : 나눗셈
	// % : 모듈러(Modular) => 나눗셈서의 나머지를 구함
	
	public void method()
	{
		int num1 = 10;
		int num2 = 3;
		
		System.out.println("num1 : " +num1);
		System.out.println("num2 : " +num2);
		
		//test();
		
		System.out.println("num1 + num2 : " +(num1 + num2));
		
		
		// 1단계 "num1 + num2 : 10"
		// 2단계 "num1 + num2 : 103"
		// 결과값이 "num1 + num2 : 103"
		// 연산 우선순위를 지정하고 싶다면 ()를 이용해서 묶어주어야함 의도한 결과를
		// 출력할 수 있음
		
		int sum = num1 + num2;
		
		System.out.println("두 수의 합계 : " + sum);
		System.out.printf("\nnum1 + num2 : %d\n", num1 + num2);
		
		System.out.println("num1 - num2 : " + (num1 - num2));
		                    // 1단계 : "num1 - num2 : 10" -3
		// 뺄셈의 경우 괄호로 묶어주지 않으면
		// 문자열과 num1을 하나로 합친 뒤 정수를 빼기 때문에 연산이 불가능함
		
		System.out.println("num1 X num2 :" + (num1 * num2));
		// *, /, % 요 친구들은 우선순위가 +, -보다 높기 때문에 묶어주지 않더라도
		// 먼저 연산을 수행해서 결과를 얻을 수 있음
		// 가독성 향상을 위해 괄호를 사용하는것을 권장
		System.out.println("num1 ÷ num2 :" + (num1 / num2));
		System.out.println("num1 mod num2 : " + (num1 % num2));
		
		// 조심조심해야할 부분
		
		//System.out.println(10/0); < 수학적으로 말이 안됨
		
	}
	
	public void test() {
		System.out.println("꼭 메인메서드에서 호출해야하는것은 아님!");
	}
	
	// 사탕 개수 구하기 프로그램을 구현하시오.
	
	// 메소드 : presentToStudent() <== 메소드 선언
	
	//사용자에게 값을 입력 <== Scanner
	// 1. 나눠줄 학생의 수
	// 2. 사탕 개수
	
	// 1인당 받을 수 있는 사탕의 개수 : 사탕 개수 / 학생의 수
	// 남은 사탕의 개수 : 사탕 개수 % 학생의 수    <== 산술연산자
	
	// 출력형식
	// 학생 한 명당 받을 수 있는 사탕의 개수 : X개 <== 출력문
	// 남은 사탕 개수 : X개 <== 출력문
	
	
}
