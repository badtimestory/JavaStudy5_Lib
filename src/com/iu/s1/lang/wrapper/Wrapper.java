package com.iu.s1.lang.wrapper;

public class Wrapper {

	public static void main(String[] args) {
		int num = 0;
		
		Integer n = Integer.valueOf(num);
		num = n.intValue();
		
		double d = 3.14;
		Double dd = d;
		
//		Interger num2 = (int)d;
		d = dd;
		
		int n2 = (int)d;
		
		String nums = "3.14";
		
		double check = Double.parseDouble(nums);
		
		System.out.println(check+1.2);	// 4.34
		
		
		n = num; 	// autoboxing
		num = num;	// autoUnboxing
		
		WrapperEx1 wp1 = new WrapperEx1();
		wp1.ex1();
		
//		System.out.println(Integer.BYTES);
//		System.out.println(Integer.MAX_VALUE);
//		System.out.println(Integer.MIN_VALUE);
//		System.out.println(Integer.SIZE);
//		System.out.println(Long.BYTES);
	}

}
