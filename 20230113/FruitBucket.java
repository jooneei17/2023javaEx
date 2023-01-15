package test;

public class FruitBucket {
	public static void main(String[] args) {
		int fruitNum = 123; //12394
		int possibleFruit = 10;

		System.out.println(fruitNum % possibleFruit == 0 ? "바구니 개수는 " + (fruitNum / possibleFruit) + "개 입니다." 
				: "바구니 개수는 " + (fruitNum / possibleFruit + 1) + "개 입니다." );
	}
}
