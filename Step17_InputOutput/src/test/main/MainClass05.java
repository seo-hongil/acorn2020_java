package test.main;

import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;

public class MainClass05 {
	public static void main(String[] args) {
		PrintStream ps=System.out;
		OutputStream os=ps;
		OutputStreamWriter osw=new OutputStreamWriter(os);
		try {
			osw.write("하나");
			osw.write("두울");
			osw.write("세엣");
			osw.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
}
}