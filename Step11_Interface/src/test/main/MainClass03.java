package test.main;

import test.mypac.Drill;
import test.mypac.Multiplayer;
import test.mypac.Remocon;

public class MainClass03 {
	public static void main(String[] args) {
		//Multiplayer 객체는 3가지 type 이 모두 될 수 있기 떄문에
	Multiplayer mp=new Multiplayer();
	//아래의 3개 메소드를 호출하면서 인자로 전달할 수 있다.
	useRemocon(mp);
	useDrill(mp);
	useMultiplayer(mp);
}
	public static void useRemocon(Remocon r) {
		r.up();
		r.down();
	}
	public static void useDrill(Drill d) {
		d.hole();
	}
	public static void useMultiplayer(Multiplayer mp) {
		mp.up();
		mp.down();
		mp.hole();
	}
}
