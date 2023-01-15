package test;

public class GreatestCommonDivisor {
	public static void main(String[] args) {
		//1. 약수 구하기
		//2. 같은 약수 중에서 가장 큰 수
		
		int num1 = 12;
		int num2 = 30;
		int greatestNum = 0;
		
		for (int i = 1; i <= num1; i++) {
			if(num1 % i == 0 && num2 % i == 0) { //num1의 약수 && num2 약수 
				greatestNum = i; //가장 큰 약수
			}
		}
		System.out.println(greatestNum);
	}
}
