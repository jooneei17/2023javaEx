package test;

import java.util.Scanner;

public class RightTriangle {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("밑변을 입력하세요: ");
		int width = scanner.nextInt();
		System.out.print("높이를 입력하세요: ");
		int height = scanner.nextInt();
		
		System.out.println("둘레는: " + (width + height + Math.sqrt(width * width + height * height )));
		System.out.println("넓이는: " + (width * height) / 2d);
		
		scanner.close();
	}
}
