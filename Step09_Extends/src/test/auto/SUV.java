package test.auto;

public class SUV extends Car{

	public SUV(Engine engine) {
		super(engine);
	}
	@Override
	public void drive() {
		super.drive();
		System.out.println("덩치큰 차 지나갑니다~");
	}
}
