package day1;

/*
 * 래퍼클래스
 * char 		int 		long	float double <- 8
 * Character	Integer		Long	Float
 * 1. 객체화	-> null값 가능	파라미터  ?age=20 --> Integer age
 * 2. 형변환.
 * 3. 박싱/언박싱
 */

public class 문자열형변환 {
	public static void main(String[] args) {
		String strAge = "20";
		//String -> int
		Integer age = Integer.parseInt(strAge);
		//int -> String 
		strAge = Integer.toString(age);
		
		System.out.println(Character.isDigit('a'));
		System.out.println(Character.isDigit('1'));
	}
}
