package test.main;

import java.util.ArrayList;

public class MainClass01 {
	public static void main(String[] args) {
		//String type 을 저장할 수 있는 index 로 관리되는 목록(List) 객체
		ArrayList<String> names=new ArrayList<String>();
		names.add("김구라");
		names.add("해골");
		names.add("원숭이");
		//배열의 방의 크기 얻어오기
		int size=names.size();
		//각각의 방에 저장된 값 불러오기
		String name1=names.get(0); //0번방
		String name2=names.get(1); //1번방
		String name3=names.get(2); //2번방
		
		//특정 방의 값 수정(덮어쓰기)
		names.set(0, "이정호"); // 0번방 수정
		
		// 특정 방의 값 삭제(방 자체를 제거하기)
		names.remove(1); // 1번방 삭제
		
		// 모든 방을 깨끗이 삭제
		names.clear();
	}
}
