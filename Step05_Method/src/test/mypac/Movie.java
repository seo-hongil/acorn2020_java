package test.mypac;

public class Movie {
	public void see() {
		System.out.println("영화를 봅니다.");
	}
	public void choice(String text) {
		System.out.println("영화 리스트:"+ text);
	}
	public void ranking(int Num, String why) {
		System.out.println("우선순위: "+Num+"이유:"+why);
	}
	public void hate(String text,String why ) {
	System.out.println();
	}
}
