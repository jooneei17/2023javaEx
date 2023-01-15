package test;

public class Fibonacci {
	public static void main(String[] args) {
		int first = 0;
		int second = 1;
		
		//fibonacci : 1, 1, 2, 3, 5, 8, 13, 21... 
		int temp = 0;
		
		for (int i = 0; i < 20 ; i++) {
			temp = first;
			first = second;
			second = temp + second; // 2 = 1 + 1
			System.out.println(first);
		}
		
		//first = 1 / second = 1
		//first = second(1) / second = first + second (2)
		//first = first + second (2) / second = second + first + second (3) 
		
	}
}
