package test;

public class IsEnglish {
	public static void main(String[] args) {
		char c = 'a';
		boolean isEn;
		boolean isNum;
		
//		(c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z') ? isEn : isEn = false;
//		(c >='0' && c<= '9') ? System.out.println("숫자입니"); : System.out.print("숫자도 영문자도 아닙니다"););
		
		isEn = c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z';
		
		isNum = c >='0' && c<= '9';
		
		System.out.println(!isEn && !isNum ? "영문자도 숫자도 아닙니다." : !isEn ? "숫자입니다." : "영문자입니다");
		
	}
}

