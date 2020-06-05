package test.mypac;

public class MyWeapon extends Weapon {
//상속받은 Weapon 클래스를 추상 클래스를 강제로 오버라이딩 해야한다.
	@Override
	public void attack() {
		System.out.println("내가 알아서 공격해요!");
	}
}
