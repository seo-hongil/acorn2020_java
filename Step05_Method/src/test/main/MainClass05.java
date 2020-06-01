package test.main;

import test.mypac.Movie;

public class MainClass05 {
	public static void main(String[] args) {
		/*
		 *	test.mypac 패키지에 다양한 모양의 메소드를 가지는
		 *	클래스를 정의하고
		 *	그 클래스를 이용해서 객체도 생성하고 메소드도 호출해 보세요. 
		 */
	Movie m1=new Movie();
	m1.see();
	m1.choice("라라랜드");
	m1.ranking(1, "보면 행복해서");
	m1.hate("헤피버스데이2","전여친 생각나서" );
	}
}
