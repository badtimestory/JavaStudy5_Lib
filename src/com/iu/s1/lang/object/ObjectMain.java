package com.iu.s1.lang.object;
/*
 * 
 * Object 클래스에 대해서 알아보자
 * @since 22.01.10
 * 
 * 
 * */
public class ObjectMain {

	public static void main(String[] args) {
		// 참조변수: 객체를 가리키는 주소를 담고 있는 변수
		ObjectStudy1 obj1 = new ObjectStudy1();
		// 참조변수명.맴버메서드명
		obj1.study1();
		
		Car car = new Car();
		System.out.println("Car : " + car);
		System.out.println(car.toString());
		
		Object obj = car;
		
		FireCar fc = new FireCar();
		fc.hashCode();
		obj = fc;
		
		boolean check = car.equals(fc);
		System.out.println(check);
	}

}
