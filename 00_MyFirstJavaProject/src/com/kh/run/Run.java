package com.kh.run;
//import com.kh.variable.A_KeyboardInput;
import com.kh.variable.B_KeyboardInput; //1.실수 확률 ↓ -> 2. 생산성(효율)증가 3. 인건비 감소↓
import com.kh.variable.A_Variable;
import com.kh.variable.Casting;

public class Run {

	public static void main(String[] args) {
		
		// 외부 클래스에 존재하는 메소드를 호출하고 싶다
		
		// 클래스이름 클래스별칭 = new 클래스이름();
		com.kh.variable.A_Variable a = new com.kh.variable.A_Variable();
//		A_Variable a = new A_Variable();
		B_KeyboardInput b = new B_KeyboardInput(); //중복코드 x
		
//		a.findSeasonMenu();
//		a.declareVariable();
		
//		b.inputTest();
		
		Casting c = new Casting();
		
		//c.autoCasting();
		c.forceCasting();
	}
	
	
}
