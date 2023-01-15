package test;

import java.util.Arrays;

public class CountMoney {
	public static void main(String[] args) {
		int[] moneyUnit = new int[] {50000, 10000, 5000, 1000, 500, 100, 50, 10};
		int amount = 237980;
		int[] moneyCount = new int[8];
		
		for (int i = 0; i < moneyUnit.length; i++) {
			moneyCount[i] = amount / moneyUnit[i];
			amount %= moneyUnit[i];
			System.out.println(moneyUnit[i] + "원: " + moneyCount[i]  + "개");
		}
		
		
	}
}
