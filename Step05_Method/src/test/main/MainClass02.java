package test.main;

import test.mypac.Car;
import test.mypac.MyObject;

public class MainClass02 {
	public static void main(String[] args) {
		MyObject obj1=new MyObject();

		//getCar()
		Car a=obj1.getCar();
		Car b=obj1.getCar();
		Car c=obj1.getCar();
		
		//
		a.drive();
		b.drive();
		c.drive();
	}
}

