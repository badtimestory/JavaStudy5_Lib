package com.iu.s3.ex1;
/*
 * 
 * ArrayList와 StringTokenizer 혼합문제
 * @ 22.01.12
 * 
 * 
 * */

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class MemberData {
	
	private String data;
	private Scanner sc;
	
	// 기본 생성자 선언
	public MemberData() {
		this.sc = new Scanner(System.in);
		this.data = "id1-pw1-name1-id1@gmail.com-20-";
		this.data = this.data + "id2-pw2-name2-id2@naver.com-42-";
		this.data = this.data + "id3-pw3-name3-id3@hanmail.net-36-";
		this.data = this.data + "id4-pw4-name4-id4@live.co.kr-17-";
		System.out.println("this.data: " + this.data);
		System.out.println();
	}
	
	public MemberDTO removeMember(ArrayList<MemberDTO> ar) {
		// 삭제하고 싶은 ID를 키보드로부터 입력
		// ArrayList에서 삭제
		MemberDTO mDTO = null;
		
		System.out.print("삭제할 id를 입력하세요: ");
		String id = sc.next();
		int index = 0;
		
		for (int i = 0; i < ar.size(); i++) {
			if(ar.get(i).getId().equals(id)) {
				mDTO = ar.remove(i);
				break;
			}
		}		
		return mDTO;
	}
	
	public void addMember(ArrayList<MemberDTO> ar) {
		// 새로 추가할 MemberDTO를 생성
		// 키보드로부터 id, pw, name, email, age 입력받아서
		// MemberDTO의 맴버변수 값으로 대입
		// 매개변수로 받은 ar에 MemberDTO 추가
		MemberDTO mDTO = new MemberDTO();
		System.out.print("id를 입력하세요: ");
		mDTO.setId(sc.next());
		System.out.print("pw를 입력하세요: ");
		mDTO.setPw(sc.next());
		System.out.print("name를 입력하세요: ");
		mDTO.setName(sc.next());
		System.out.print("email를 입력하세요: ");
		mDTO.setEmail(sc.next());
		System.out.print("age를 입력하세요: ");
		mDTO.setAge(sc.nextInt());
		ar.add(mDTO);		
	}
	
	public ArrayList<MemberDTO> init() {
		// data에 있는 문자열을 StringTokenizer로 파싱해서
		// MemberDTO를 생성해서 멤버변수값으로 대입
		// MemberDTO들을 ArrayList에 담아서 리턴
		System.out.println("MemberEx1 Branch");
		
		StringTokenizer st = new StringTokenizer(this.data, "-");
		ArrayList<MemberDTO> ar = new ArrayList<>();
		
		while (st.hasMoreTokens()) {
			MemberDTO mDTO = new MemberDTO();
			mDTO.setId(st.nextToken().trim());
			mDTO.setPw(st.nextToken().trim());
			mDTO.setName(st.nextToken().trim());
			mDTO.setEmail(st.nextToken().trim());
			mDTO.setAge(Integer.parseInt(st.nextToken().trim()));
			ar.add(mDTO);
		}
		
		return ar;
	}
}
