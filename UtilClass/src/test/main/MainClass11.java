package test.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MainClass11 {
	public static void main(String[] args) {
		Map<String, String> dic=new HashMap<>();
		dic.put("house", "집");
		dic.put("phone", "전화기");
		dic.put("car", "자동차");
		dic.put("pencil", "연필");
		dic.put("eraser", "지우개");
		/*
		 * 검색할 단어를 입력하세요 : house
		 * 
		 * house 의 뜻은 집입니다.
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("검색할 단어를 입력하세요 : ");
		String s1=scan.nextLine(); // 문자열 입력 받기
		//Map 객체에서 입력한 문자열로 저장된 값을 읽어와 보기
		String s2=dic.get(s1);
		if(s2==null) {//존재 하지 않으면
			System.out.println(s1+"는 목록에 없습니다.");
		}else {
			//출력할 문자열 구성하고, 출력하기
			String line=s1+" 의 뜻은 "+s2+"입니다.";
			System.out.println(line);
		}
		
		
	}
}
