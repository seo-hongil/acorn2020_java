package test.main;

import java.io.File;

public class MainClass09 {
	public static void main(String[] args) {
		//이미 만들어 졋거나 혹은 만들 예정인 파일을 access 할 수 있는 File 객체
		File f1=new File("C:/acorn2020/MyFolder/gura.txt");
		try {
			f1.createNewFile();
			System.out.println("gura.txt 파일을 만들었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
