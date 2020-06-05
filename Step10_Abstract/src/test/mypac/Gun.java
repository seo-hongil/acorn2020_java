package test.mypac;

public class Gun extends Weapon{
	public void shut() {
		System.out.println("한방에 팍!");
	}

	@Override
	public void attack() {
	}
}
