package day2;

public class MethodTest {
	public static void main(String[] args) {
		printHead(); //매개변수 X 리턴 X
		printString("menu");
		printString("header");
		
		sum(5,4);	//매개변수가 있는 메서드 리턴 X
		int num = mul(5,4);	//매개변수 O 리턴 O
		
		
		
		System.out.println(total(2,3,4,10));
		System.out.println(total(2,3));
		System.out.println(total(2,3,1,3,3,45,4));
	}
	static int total(int ... score) {	//[] 매개변수(가변)
		int result = 1;	//결과 저장할변수
		for(int num : score) {			//score 배열 반복문
				result *= num;		//합계계산
		}
		return result;		//결과 리턴
	}
	
	static int mul (int num1, int num2) {
		//두수의 합을 계산
		int result = num1 * num2;
		return result;
	}
	
	static void sum(int num1,int num2) {
		//두수의 합을 출력
		int result = num1 + num2;
		
		//합계 출력
		System.out.println(result);
		return;
	}
	
	
	//중복되는 코드 => 메서드
	static void printHead(){
		System.out.println("==========");
		System.out.println("==header==");
		System.out.println("==========");
	}
	
	static void printFooter() {

		System.out.println("==========");
		System.out.println("==footer==");
		System.out.println("==========");

	}
	
	static void printString(String str){
		System.out.println("==========");
		System.out.println("=="+ str + "==");
		System.out.println("==========");
	}
}
