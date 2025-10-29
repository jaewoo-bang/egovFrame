package day1;

public class 데이터타입 {

	public static void main(String[] args) {
		//1. 반려견의 이름을 name 변수에 저장하세요
		String name = "몽몽";
		//2. 반려견의 나이를 age 변수에 저장하세요
		long age = 4;
		//3. 반려견의 몸무게를 weight 변수에 저장하세요
		double weight = 12.4;
		
		System.out.println("나의 반려견 이름은 :" + name);
		System.out.println("나의 반려견 나이는 :" + age);
		System.out.println("나의 반려견 몸무게는 :" + weight);
		
		
		//유효자리수 ( 가수부 + 진수부)
		// 0.1234567890		1.234567 *
//		   0.0001	0.1 * 10 -3		1 	-3		float
//		   0.1		0.1 * 10  0 	1    0 
//		   0.001    0.1 * 10  -2    1    -2
//		   0.11     0.11 * 10  0    11    0      
		// 유니코드 한글 범위 -> ac00 ~ ___
		
//		문자 : char -> String
//		숫자   int, long, double
//		날짜   date

// 		관계/논리 ==> if 조건
//and &&	둘중 하나라도 false면 flase 
//or	||	
//not !
		
//x=5	++이 앞에 붙으면 선계산 뒤에 붙으면 실행후 계산 ++x는 6 x++는 실행전 5이지만 실행후 6 
//y=5 
//if(	x > 10 && y > 10 )
//	상태변경
		
//js for(item of list)	==>	for( int item : list)
//   for(item in list)
//   list.foreach()
		
//배열 
//js : let arr = []	//동적배열
//		
//java: ArrayList list = new ArrayList();	//동적
//int [] arr  = new list();

	}
}
