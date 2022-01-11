package com.iu.s1.lang.wrapper;

import java.util.Scanner;

public class WrapperEx1 {
	
	public void ex2() {
		// 키보드로부터 주민등록번호 압력
		// 9  7  1 2  2  4 - 1  2 3  4  5  6 7 - 마지막 번호는 체크용 번호
		// 2  3  4 5  6  7 - 8  9 2  3  4  5
		// 18 21 4 10 12 28  8 18 6 12 20 30
		// 결과를 모두 더함 ex) 187
		
		// 2. 모두 더한 결과값을 11로 나누어서 나머지를 구함
		// 187/11 → 17 ... 0
		
		// 3. 11로 나눈 나머지값을 11에서 빼고 그 값을 체크용 번호와 같은지 확인
		// 11-0 = 11 == 7
		// 4. 만약에 결과값이 두 자리라면 결과값을 다시 10으로 나누어서 그 나머지 값을
		// 체크용 번호랑 같은지 비교
		// 11/1...1 == 7
		// 같으면 정상적인 주민번호, 아니면 잘못된 번호
	}
	
	public void ex1() {
		// 키보드로부터 주민등록번호 입력
		// 011224-1234567
		Scanner sc = new Scanner(System.in);
		System.out.print("주민등록번호를 입력해주세요(앞자리 숫자6개-뒷자리 숫자7개): ");
		String registNumber = sc.next();
		System.out.println("주민등록번호: " + registNumber);
		// 주민등록번호 앞자리
		String frontNum = registNumber.substring(0, 6);
		// 주민등록번호 뒷자리
		String backNum = registNumber.substring(7, 14);
				
		// 남자? 여자?
		int sexNum = Integer.parseInt(backNum.substring(0, 1));
		if(sexNum == 1 || sexNum == 3) {
			System.out.println("남자입니다.");			
		} else if(sexNum == 2 || sexNum == 4) {
			System.out.println("여자입니다.");
		}
		
		// 나이를 대충 계산
		// 현재연도 - 주민등록연도
		int currentYear = 2022;
		String yearNum = frontNum.substring(0, 2);
		// 20세기 전
		int beforeTwentyCentury = Integer.parseInt("19" + yearNum);
		// 20세기 후
		int twentyCentury = Integer.parseInt("20" + yearNum);
		// 20세기 전 나이
		int beforeTwentyCenturyAge = currentYear - beforeTwentyCentury;
		// 20세기 후 나이
		int twentyCenturyAge = currentYear - twentyCentury;
		if(sexNum == 1 || sexNum == 2) {
			System.out.println(beforeTwentyCenturyAge + "살입니다.");
		} else if (sexNum == 3 || sexNum == 4) {
			System.out.println(twentyCenturyAge + "살입니다.");
		}
		// 3-5 : 계절 봄
		// 6-8 : 여름
		// 9-11 : 가을
		// 12-3 : 겨울
		int seasonNum = Integer.parseInt(frontNum.substring(2, 4));
		switch (seasonNum) {
		case 3, 4, 5:
			System.out.println("봄");
			break;
		case 6, 7, 8:
			System.out.println("여름");
			break;
		case 9, 10, 11:
			System.out.println("가을");
			break;
		case 12, 1, 2:
			System.out.println("겨울");
			break;
		}
	}
}
