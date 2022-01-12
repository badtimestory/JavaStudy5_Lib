package com.iu.s1.lang.wrapper;

import java.util.Scanner;

public class WrapperEx1 {
	private	Scanner sc;
	
	public WrapperEx1() {
		this.sc = new Scanner(System.in); 
	}
	
	public void ex2() {
		// 키보드로부터 주민등록번호 압력
//		System.out.println("주민등록번호를 입력하세요: ");
//		String jumin = sc.next();
		String jumin = "971224-1234567";
		
		// 9  7  1 2  2  4 - 1  2 3  4  5  6 7 - 마지막 번호는 체크용 번호
		//*2  3  4 5  6  7 - 8  9 2  3  4  5
		// 18 21 4 10 12 28  8 18 6 12 20 30
		// 결과를 모두 더함 ex) 187
		
		int source = 2;
		int sum = 0;
		
//		for (int i = 0; i < jumin.length(); i++) {
//			String result = jumin.substring(i, i+1);
//			if(!result.equals("-")) {
//				System.out.println(Integer.parseInt(result));				
//			}
//		}
		
		// ----------
		for (int i = 0; i < jumin.length()-1; i++) {
			if (source > 9) {
				source = 2;
			}
			char ch = jumin.charAt(i);
			// Integer.parseInt("" + ch);
			if(ch != '-') {
				int num = Integer.parseInt(String.valueOf(ch));
				sum = sum + (num * source);
				source++;
			}
		} // end of for
		System.out.println(sum);
		

		// 2. 모두 더한 결과값을 11로 나누어서 나머지를 구함
		// 187/11 → 17 ... 0
		sum = sum % 11;
		// 3. 11로 나눈 나머지값을 11에서 빼고 그 값을 체크용 번호와 같은지 확인
		sum = 11 - sum;
		// 11-0 = 11 == 7
		// 4. 만약에 결과값이 두 자리라면 결과값을 다시 10으로 나누어서 그 나머지 값을
		// 체크용 번호랑 같은지 비교
		// 11/1...1 == 7
		if(sum > 9) {
			sum = sum % 10;
		}
		
		int check = Integer.parseInt(String.valueOf(jumin.charAt(jumin.length()-1)));
		System.out.println("check: " + check);
		System.out.println("sum: " + sum);
		
		if (sum == check) {
			System.out.println("OK");
		} else {
			System.out.println("Fail");
		}
		// 같으면 정상적인 주민번호, 아니면 잘못된 번호
		
	}
	
	public void ex1() {
		System.out.print("주민등록번호를 입력하세요: ");
		String jumin = sc.next();
		System.out.println(jumin);
		jumin = "971224-1234567";
		int age = 0;
		int year = 0;
		// 키보드로부터 주민등록번호 입력
		// 971224-1234567;
		// ---------- 연도 파싱 ----------
		
		String y = jumin.substring(0, 2);
		year = Integer.parseInt(y);	// 97
		System.out.println("y: " + y);
//		char ch1 = jumin.charAt(0);
//		char ch2 = jumin.charAt(1);
//		System.out.println("y :" + y);
		
		// ---------- 성별 파싱 ----------
		String s = jumin.substring(7, 8);
		char ss = jumin.charAt(7);
		
		int preYear = 2000;
		
		if(ss == '1' || ss == '2') {
			preYear = 1900;
		}
		

		// 나이를 대충 계산
		// 현재연도 - 출생연도
		year = preYear + year;
		age = 2022 - year;
		System.out.println("age: " + age);
		// 남자? 여자?
		String se = "Woman";
		if(ss == '1' || ss == '3') {
			se = "Man"; 
		}
		System.out.println("성별: " + se);
		
		// 3-5 : 계절 봄
		// 6-8 : 여름
		// 9-11 : 가을
		// 12-3 : 겨울
		String result = "";
		int season = Integer.parseInt(jumin.substring(2, 4));
		if(season >= 3 && season <= 5) {
			result = "봄";
		} else if (season >= 6 && season <= 8) {
			result = "여름";
		} else if (season >= 9 && season <= 11) {
			result = "가을";
		} else {
			result = "겨울";
		}
		
	}
}
