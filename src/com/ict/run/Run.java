package com.ict.run;

import com.ict.model.vo.Child1;
import com.ict.model.vo.Child2;
import com.ict.model.vo.Parent;

public class Run {
	public static void main(String[] args) {
		// 1. 부모 타입 레퍼런스로 부모 객체를 다룰 때 --> p1레퍼런스로 Parent만 접근 가능
		System.out.println("==1. 부모타입 레퍼런스로 부모 객체 다루는 경우 ==");
		Parent p1 = new Parent();
		p1.printParent();
	
		// 2. 자식타입 레퍼런스로 자식 객체를 다룰 때 --> c1 레퍼런스로 Child1, Parent둘다 접근 가능
		// (Parent접근 시 자동으로 형변환 된 채로 진행된다. --> 형변환 생략가능)
		System.out.println("==2. 자식타입 레퍼런스로 부모 객체 다루는 경우 ==");
		Child1 c1 = new Child1();
		((Parent)c1).printParent();   // 업 캐스팅 : 자식타입 --> 부모타입 (생략가능)
		c1.printParent();
		c1.printChild1();
		
		// 3. 부모 타입 레퍼런스로 자식 객체를 다를 때 --> p2 레퍼런스로 Parent접근 가능
		// (단, Child2 접근 시 명시적으로 형 변환 해줘야한다.)
		System.out.println("==3. 부모 타입 레퍼런스로 자식 객체 다루는 경우 ==");
		Parent p2 = new Child2(); 			// 업 캐스팅 : 자식타입 --> 부모타입 (생략가능)
		p2.printParent();  					// 현재로는 부모타입의 것만 가지고 올수있음
		((Child2)p2).printChild2();         // 다운 캐스팅 : 부모타입 --> 자식타입(생략불가능)
		
		// 4. 자식 타입 레퍼런스로 부모 객체를 다룰 때
		//Child2 c2 = new Parent();			// --> 컴파일 에러 : 소스상의 문법오류
		
		//Child2 c2 = (Child2)(new Parent());
		//Child2 c2 = (Child2)p1;				// 둘다 오류는 안나는데 실행하면 오류가 발생
		                                    // 이런걸 런타임 에러 : 컴파일 에러는 없지만 프로그램 실행 시에 에러
		
		
		
	}
}
