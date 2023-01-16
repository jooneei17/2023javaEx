package test;

public class Palindrom {
	public static void main(String[] args) {
		
		int num11 = 12321;
		int origin = 12321; //원본값의 보존을 위해 
		int result = 0;
		
		int temp11 = 0;
		
//		숫자를 역순으로 재배치하여 원본 값과 비교
		while(num11 != 0) {
			temp11 = num11 % 10;
			System.out.println(temp11);
			result *= 10;
			result += temp11;
			num11 /= 10;
			System.out.println(num11);
			
		}
		
		System.out.println(temp11);
		System.out.println(num11);
		System.out.println(result == origin ? "회문수" : "아님");
		
		
		
		
		//회문수  ex) 12321, 1234321
		int num = 232242232; //1 2 3 2 1   1 2 3 4 3 2 1
		boolean palindrom = true;
		
//		자릿수 구하기
		int len = 0;
		int temp = num;
		while(temp > 0) {
			temp /= 10; //한 자릿수씩 확인
			len++; //길이 증가
		}
		
		int square = 1; //자릿수에 따른 제곱 값
		for (int i = 0; i < len -1; i++) {
			square *= 10;
		}
		
//		1. 첫번째 숫자 구하기, 마지막 숫자 구하기 
//		2. 1번이 참이면 첫 숫자, 마지막 글자 제거후 반복 (232를 구해서 1번 다시하기)
//			2-1 첫 숫자 제거 -> 2321
//			2-2 마지막 숫자 제거 -> 232
//		3. 1번이 거짓이면 palindrom을 false로 바꾸고 while문 탈출 
//		
		
		int first = 0; //첫번째 숫자
		int last = 0; //마지막 숫자

		while(num >= 10) { //가운데 숫자가 한자리만 남을때까지
			first = num / square;
			last = num % 10;
			if(first != last) {
				palindrom = false;
				break;
			}
			num = (num % square) / 10; //첫글자, 마지막 글자 제거
			square /= 100;

		}
		
		if(palindrom) 
			System.out.println("회문수 입니다.");
		else
			System.out.println("회문수 아닙니다.");

	}
}
