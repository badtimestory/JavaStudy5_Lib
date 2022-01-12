package com.iu.s2.util.collection;

import java.util.ArrayList;

public class ListStudy {
	
	public void study3() {
		
		
		//gerneric
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(1);
//		ar.add('b');
//		ar.add(3.12);
//		ar.add("iu");
		
		for (int i = 0; i < ar.size(); i++) {
			System.out.println("ar.get(" + i + "): "   + ar.get(i));
		}
		
		int num = ar.get(0);
	}
	
	public void study2() {
		ArrayList ar = new ArrayList();
		int num = 1;
		Integer n = num;	// autoBoxing
		ar.add(n);
		ar.add(1);			// autoBoxing
		
		ar.add('a');		// autoBoxing
		
		ar.add(3.12);		// autoBoxing
		
		ar.add("name");		// 다형성
		
		String k = "iu";	// String is a Object
		Object obj = k;		// 다형성

	
	}
	
	public void study1() {
		int[] numbers = new int[2];
		ArrayList ar = new ArrayList(); // 기본 10칸

		// 대입
		numbers[0] = 1;
		numbers[1] = 2;

		ar.add(1);
		ar.add(2);
		ar.add(3);
		ar.add(1, 100);
		ar.set(0, 2000);
		ar.remove(0);
		ar.clear();

//		System.out.println("numbers[0]: " + numbers[0]);
//		System.out.println("ar.get(0): " + ar.get(0));

		for (int i = 0; i < numbers.length; i++) {
			System.out.println("number[" + i + "]: " + numbers[i]);
		}

		for (int j = 0; j < ar.size(); j++) {
			System.out.println("ar[" + j + "]: " + ar.get(j));
		}
		System.out.println("List 출력");
	}
}

