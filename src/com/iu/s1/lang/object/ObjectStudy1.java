package com.iu.s1.lang.object;
/*
 * 
 * 
 * @since 22.01.10
 * 
 * 
 * */
public class ObjectStudy1 {
	
	// 생성자가 없으면 컴파일러가 기본생성자를 만들어줌
	// 기본생성자는 매개변수가 없는 생성자
	// ObjectStudy1() {}
	
	public void study1() {
		System.out.println("Study1 실행");
		// Object 객체를 생성하고 주소출력
		Object obj = new Object();
		System.out.println(obj);
		// Clone 호출
		int num = obj.hashCode();
		System.out.println("hashCode(): " + num);
		
		String string = obj.toString();
		System.out.println("toString(): " + string);
		
	}
}
