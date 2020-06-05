package test.mypac;
/*
 * 구현 되지 않은 추상 메소드를 멤버로 가지고 있는 클래스는
 * abstract 예약어를 붙여서 정의해야한다.
 */
public abstract class Weapon {
	//무기 작동을 준비하는 메소드
	public void prepare() {
		System.out.println("무기 작동을 준비합니다.");
	}
	//구현 되지 않은 추상 메소드를 abstract 예약어를 붙여서 정의해야한다.
	public abstract void attack();
}
