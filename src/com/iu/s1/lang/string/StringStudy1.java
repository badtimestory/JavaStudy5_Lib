/*
 * 
 * String 클래스에 있는 메서드 사용해보기
 * @since 22.01.10
 * 
 * 
 * */
package com.iu.s1.lang.string;

import java.util.Scanner;

public class StringStudy1 {
	
	public void splitTest() {
		String name = "iu suji choa 펭수 춘식이";
		String[] names = name.split(" ");
		for (int i = 0; i < names.length; i++) {
			System.out.println("names[" + i + "]: " + names[i].trim());			
		}
	}
	
	public void valueTest() {
		int num = 1000;
		String result = String.valueOf(num);
		System.out.println("valueOf: " + result);
	}
	
	public void caseTest() {
		String title = "West Side Story";
		String result = title.toUpperCase();
		String result2 = title.toLowerCase();
		
		System.out.println("title: " + title);
		System.out.println("toUpperCase(): " + result);
		System.out.println("toLowerCase(): " + result2);
	}
	
	public void replaceTest() {
		String title = "West Side Story";
		// 참조변수명.멤버메서드명()
		String result = title.replace("West", "North");
		
		System.out.println("title: " + title);
		System.out.println("result: " + result);
	}
	
	
	public void subStringEx1() {
		// 키보드로부터 업로드할 파일명을 입력
		// a.txt, b.pdf, iu.jpg
		// jpg, gif, png -> 이미지파일입니다 출력
		// txt, pdf, hwp -> 문서 파일입니다 출력
		// mp3, wav, ogg -> 음원 파일입니다 출력
		// 나머지는 알 수 없습니다
		System.out.print("업로드할 파일을 입력해주세요: ");
		Scanner sc = new Scanner(System.in);
		String data = sc.next();
		
		String fileName = data.substring(data.lastIndexOf(".")+1);
		System.out.println(fileName);
		
		if(fileName.equals("jpg") || fileName.equals("gif") || fileName.equals("png")) {
			System.out.println("이미지 파일입니다.");
		} else if (fileName.equals("txt") || fileName.equals("pdf") || fileName.equals("hwp")){
			System.out.println("문서 파일입니다.");
		} else if (fileName.equals("mp3") || fileName.equals("wav") || fileName.equals("ogg")) {
			System.out.println("음원 파일입니다.");
		} else {
			System.out.println("알 수 없습니다.");
		}
		
		
	}
	
	public void subStringTest() {
		String title = "West Side Stroy";
		String result = title.substring(title.indexOf("S"));
		System.out.println(result);
		result = title.substring(5, 9);
		System.out.println(result);
	}
	
	public void lengthTest() {
		String title = "West Side Stroy";
		int len = title.length();
		System.out.println(len);
		
		// title find에 들어가있는 글자가 몇 개 인지 출력
		String find = "S";
		int count = 0;
		for(int i = 0; i < title.length(); i++) {
			int index = title.indexOf(find, i);
			if(index >= 0) {
				count++;
				i=index;
			}
		}
		System.out.println("count: " + count);			
		
		// 한글자씩 출력
		// W
		// e
		// s 
		// ...
//		for (int i = 0; i < title.length(); i++) {
//			System.out.println(title.charAt(i));
//		}
	}
	
	public void indexOfTest() {
		String msg = "Hello World!";
		// indexOf 호출
		int num = msg.indexOf('W');		// int ch = 'W';
		System.out.println(num);
	}
	
	public void equalTest() {
		String str = "iu";
		String str2 = "iu";
		String str3 = new String("iu");
		String str4 = new String("iu");

		System.out.println(str == str2);
		System.out.println(str3 == str4);
		System.out.println(str == str3);
		System.out.println("=====");
		System.out.println(str.equals(str2));
		System.out.println(str3.equals(str4));
		System.out.println(str.equals(str3));
		
	}
	
	public void study1() {
		String name = "hello";
		
		//charAt 메서드 호출
		System.out.println("name: " + name);
		for(int i = 0; i < name.length(); i++) {
		System.out.println("charAt(" + i + "): " + name.charAt(i));
		}
		
		String name2 = new String("Hello2");
		
		System.out.println(name);
		
	}
}
