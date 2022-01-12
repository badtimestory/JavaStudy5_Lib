package com.iu.s2.util.token;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class TokenStudy {
	public static void main(String[] args) {
		
		String str = "봄, 16, 여름, 32,가을, 20,겨울, -15";
		String[] s = str.split(",");
		
		StringTokenizer st = new StringTokenizer(str, ",");
		
		ArrayList<SeasonDTO> ar = new ArrayList<>();
		
		while (st.hasMoreTokens()) {
			SeasonDTO sDto = new SeasonDTO();
			String token = st.nextToken().trim();
			sDto.setName(token);		// 봄
			
			token = st.nextToken();		// 16
			sDto.setTemp(Integer.parseInt(token.trim()));
			
			System.out.println("sDto.getName: " + sDto.getName());
			System.out.println("sDto.getTemp: " + sDto.getTemp());
		}
		
		for(int i = 0; i < ar.size(); i++) {
			SeasonDTO seasonDTO = ar.get(i);
			System.out.println();
		}
	}
}
