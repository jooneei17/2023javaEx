package test;

public class RountOff {
	public static void main(String[] args) {
		double num = 1.2340;
		num *= 10000;

		int numInt = (int)num;
		
//		12342 => 1235 => 1.235
//		소수점 넷째자리 숫자가 0일 때와 아닐 때 
		System.out.println(numInt);
		System.out.println(numInt % 10);
		
		System.out.println(numInt % 10 < 5 ? "반올림한 숫자는 " + (numInt / 10) / 1000d : "반올림한 숫자는 " + (numInt + 10)/10 / 1000d);
		
	}
}
