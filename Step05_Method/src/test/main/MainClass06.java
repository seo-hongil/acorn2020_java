package test.main;

import test.mypac.Car;
import test.mypac.Messenger;

public class MainClass06 {
	public static void main(String[] args) {
		//Messenger 클래스의 static 메소드 3개를 하나씩 호출해 보세요.
	Messenger.sendMessenger("안녕");
	String a=Messenger.getMessenger();
	Messenger.useCar(new Car());
	}
}
