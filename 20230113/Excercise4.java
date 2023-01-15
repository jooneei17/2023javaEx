package test;

import java.util.Arrays;

public class Excercise4 {
	public static void main(String[] args) {
		int[] num1 = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int[] num2 = new int[10];
		
		for (int i = 0; i < 10; i++) {
			num2[i] = num1[i] * num1[i];
		}
		
		System.out.println(Arrays.toString(num2));
	}
}
