package test;

import java.util.Scanner;

public class GeometricSequence {
	public static void main(String[] args) {
		
		//다음 식처럼 계산하면 첫항에 대한 규칙을 구할 수 있다.
		for (int i = 0; i < 20; i++) {
			int val = 1;
			for (int j = 0; j < i; j++) {
				val *= 2;
			}
			System.out.print(val + " ");
		}
		
		
		//등비수열 ex) 3, 6, 12, 24, ...
//		int num = 3;
//		
//		for (int i = 0; i < 20; i++) {
//			System.out.println(num *= 2);
//		}
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫 항을 입력하세요: ");
		int inputNum = scanner.nextInt();
		
		System.out.print("공비를 입력하세요: ");
		int inputRatio = scanner.nextInt();
		
		System.out.println(inputNum); //첫항.... 첫항은 규칙이 없을까..??
		for (int i = 0; i < 20 - 1; i++) {
			System.out.println(inputNum *= inputRatio);
		}
		
		scanner.close();
	}
}
