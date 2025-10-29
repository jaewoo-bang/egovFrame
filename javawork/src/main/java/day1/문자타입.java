package day1;

public class 문자타입 {
	public static void main(String[] args) {
		char c1 = 'A';
		System.out.println(c1);
		System.out.println((int)c1);		//형변환 == 캐스트연산자
		System.out.println((char)(c1+32));	//소문자 'a'
	}
}
