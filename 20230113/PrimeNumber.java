package test;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
// 		int count = 0;
		
// 		for(int j = 2; count < 30; j++) { //n개를 출력하기 위해 count변수가 n보다 작을 때까지 반복
// 			boolean prime = true;
// 			int num = j;
			
// 			for (int i = 2; i < num; i++) { //소수의 범위가 2부터 자신을 포함X
// 				if(num % i == 0) { 
// 					prime = false;
// 					break;
// 				}
// 			}
// 			if(prime) {
// 				System.out.print(j + " ");
// 				count++;
// 			}
			
// 		}
		
		//소수 ex) 2, 3, 5, 7, 11, 13, 17, 19....
		
		Scanner scanner = new Scanner(System.in); //정수 입력받기
		
		System.out.print("정수를 입력하세요: ");
		int num = scanner.nextInt();
		boolean isPrimeNumber = true; //소수인지 아닌지

		
		for (int i = 1; i <= num; i++) {
			if(num % i == 0) { //약수 구하기
				if((i == 1 || i == num) && num != 1) {}
				else
					isPrimeNumber = false; //약수가 1과 자기자신이 아닐 때 false
			}
		}

		//반복문을 두 번 사용하여 비효율적 ㅡ.ㅡ
//		for (int i = 1; i <= num; i++) {
//			for (int j = 1; j <= num; j++) {
//				if(i * j == num) { //약수 구하기
//					if((i == 1  || i == num ) && num != 1) {} 
//					else 
//						isPrimeNumber = false; //약수가 1과 자기자신이 아닐 때 false
//				}
//			}
//		}
		
		if(isPrimeNumber)
			System.out.println(num + "은 소수 입니다.");
		else 
			System.out.println(num + "은 소수가 아닙니다.");	
		
		scanner.close();
	}
}
