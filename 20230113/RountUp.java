package test;

public class RountUp {
	public static void main(String[] args) {
				
		double d = 1.234567;
		double result = (int)(d * 1000) / 1000d;
		System.out.println(result);
		double result2 = (int)(d * 1000 + .9) / 1000d;
		System.out.println(result2);
		
		
		//올림
		double num = 1.23406789;//1.235
		num *= 10000;

		int numInt = (int)num;
		
//		12342 => 1235 => 1.235
//		소수점 넷째자리 숫자가 0일 때와 아닐 때 
		System.out.println(numInt % 10 == 0 ? "올림한 숫자는 " + numInt / 10000d : "올림한 숫자는 " + (numInt + 10)/10 / 1000d);	
	}
}
