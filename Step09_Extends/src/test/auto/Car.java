package test.auto;


public class Car {
	//필드
	protected Engine engine;
	
	//Engine 객체를 인자로 전달 받는 생성자
	public Car(Engine engine) {
		//필드에 저장하기
		this.engine=engine;
	}
	public void drive() {
		if(engine==null) {
			System.out.println("Engine 객체가 없어서 달릴  수 없어요");
			return; //메소드 끝내기
		}
		System.out.println("달려요");
	}
}
