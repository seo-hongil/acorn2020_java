package test.mypac;

public class Messenger {
<<<<<<< HEAD
	//String type 을 인자로 전달받는 static 메소드
	public static void sendMessenger(String msg) {
		System.out.println(msg+"를 전송 합니다.");
	}
	//String type을 리턴해주는 static 메소드
	public static String getMessenger() {
		return "hello";
	}
	//Car type을 인자로 전달받은 static 메소드
	public static void useCar(Car c) {
		c.drive();
	}
}
=======
	//String type  을 인자로 전달받는 static 메소드 
	public static void sendMessage(String msg) {
		System.out.println(msg+" 를 전송 합니다.");
	}
	//String type  을 리턴해주는 static 메소드 
	public static String getMessage() {
		return "hello";
	}
	//Car type 을 인자로 전달 받는 static  메소드 
	public static void useCar(Car c) {
		c.drive();
	}
}


>>>>>>> refs/remotes/upstream/master
