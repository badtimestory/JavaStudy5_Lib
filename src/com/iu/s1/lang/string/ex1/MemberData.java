package com.iu.s1.lang.string.ex1;

public class MemberData {
	
	private String data;
	
	// 기본 생성자 선언
	public MemberData() {
		this.data = "id1-pw1-name1-id1@gmail.com-";
		this.data = this.data + "id2-pw2-name2-id2@naver.com-";
		this.data = this.data + "id3-pw3-name3-id3@hanmail.net-";
		this.data = this.data + "id4-pw4-name4-id4@live.co.kr-";
		System.out.println("this.data: " + this.data);
		System.out.println();
	}
	
	public MemberDTO[] init() {
		String[] datas = this.data.split("-");
		MemberDTO[] members = new MemberDTO[datas.length / 4];
		int index = 0;
		
		for(int i = 0; i < members.length; i++) {
			MemberDTO mDTO = new MemberDTO();
			mDTO.setId(datas[index+(4*i)]);				// datas[0] 4 8
			mDTO.setPw(datas[index+(4*i)+1]);			// datas[1] 5 9
			mDTO.setName(datas[index+(4*i)+2]);			// datas[2] 6 10
			mDTO.setEmail(datas[index+(4*i)+3]);		// datas[3] 7 11
			members[i] = mDTO;
			//index++;
		}
		return members;
//		for (int i = 0; i < result.length; i++) {
//			System.out.println("result[" + i + "]: " + result[i].trim()); 
		}
	}
