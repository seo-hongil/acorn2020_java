package test.main;

import java.util.Random;

public class MainClass07 {
	public static void main(String[] args) {
	

	/*
	 * 2.Random 객체를 이용해서 로또 번호를 6개 랜덤하게 얻어내서
	 * 배열에 저장한다.
	 * 모두 다 저장이 되면 for 문을 이용해서 배열에 저장된 모든 로또 번호를
	 * 콘솔창에 순서대로 출력하는 코드를 작성해 보세요. 
	 */		
		Random ran=new Random();
		//로또 번호를 저장할 수 있는 방 6개짜리 배열 객체 생성하기
		int[] nums=new int[6];
		for(int i=0; i<6;i++ ) {
			int lottoNum=ran.nextInt(45)+1;
			//순서대로 저장하기
			nums[i]=lottoNum;
		}
		for(int tmp: nums ) {
			System.out.println(tmp);
		}
			//Random ran=new Random();
	 		//int lottoNum=ran.nextInt(45)+1;
	 		//int lottoNum2=ran.nextInt(45)+1;
	 		//int lottoNum3=ran.nextInt(45)+1;
	 		//int lottoNum4=ran.nextInt(45)+1;
	 		//int lottoNum5=ran.nextInt(45)+1;
	 		//int lottoNum6=ran.nextInt(45)+1;
	 		//int[] num=new int[6];
	 		//num[0]=lottoNum;
	 		//num[1]=lottoNum2;
	 		//num[2]=lottoNum3;
	 		//num[3]=lottoNum4;
	 		//num[4]=lottoNum5;
	 		//num[5]=lottoNum6;
	 	
	 		//for(int i=0; i<num.length;i++ ) {
			//System.out.println(num[i]);
	 		//}
	}
}
