package test.main;

import test.human.Blood;

public class MainClass10 {
	public static void main(String[] args) {
		//Blood 객체를 생성해서 참조값을 b1 이라는 지역 변수에 담아 보세요.
		Blood b1 = new Blood("+","O"); //Rh+ O 형 혈액형을 의미
		
		Blood b2 = new Blood("+", "A"); //Rh A형 혈액형을 의미
		
		//Blood 객체의 getter 메소드 사용해 보기
		String result1=b1.getRh(); // "+"
		String result2=b1.getType(); // "O"
		
		String result4=b2.getRh(); // "+"
		String result5=b2.getType(); // "A"
		
		//만약 javascript를 사용했으면, 
		//let b1={th:"+", type:"O"};
		//let b2={rh:"+"<type:"A"};
	}
}
