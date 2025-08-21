package com.kh.operator.run;

//1절 import 절 작성하기
import com.kh.operator.A_Arithmetic;
import com.kh.operator.B_InDecrease;
import com.kh.operator.C_Compound;
import com.kh.operator.D_LogicalNagation;
import com.kh.operator.E_Comparison;
import com.kh.operator.F_Logical;
import com.kh.operator.Candy;
import com.kh.operator.G_Triple;
// 이 클래스를 만든 이유 : 프로그램 실행하려고
public class Run { //Run이라는 메서드의 9행의 main 메서드의 스코프에 진입함

	// 프로그램 실행 -> 메모리에 올라감 ==프로세스
	// 메인메서드는 static 메모리에 올라감
	// 메인메서드에서 호출하는 다른 메서드들은 stack메모리에 올라감
	// 호출이 끝나고 나면 stack 메모리에서 사라짐
	public static void main(String[] args)
	{
		//2절 import해온 클래스에다가 별칭 붙이고 new(생성) 해주기
		//A_Arithmetic a = new A_Arithmetic();
		
		//a.method();
		
		//Candy can = new Candy();
		
		//can.PresentToStudent();
		
		B_InDecrease b = new B_InDecrease();
		//b.method1();
		//b.method2();
		//b.method3();
		C_Compound c = new C_Compound();
		//c.method1();
		D_LogicalNagation d = new D_LogicalNagation();
		//d.method1();
		E_Comparison e = new E_Comparison();
//		e.method1();
		F_Logical f = new F_Logical();
		//f.method1();
		//f.method2();
		//f.method3();
		G_Triple g = new G_Triple();
		//g.method1();
		//g.method2();
		g.Practice();
		
	}
	
}
