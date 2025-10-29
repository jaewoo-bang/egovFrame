package day1;

/*
 * 근무시간 맞으면(9~18) Y / N 
 */

public class 조건문 {
	public static void main(String[] args) {
	int workTime = 10;
	
	int lTime = 1;
	int sTime = 10;
	int eTime = 18 - lTime;	//점심시간 1시간 빼고
	//총근무시간이 8시간이상이면 "초과근무" 출력
	if(eTime - sTime >= 8) {
		System.out.println("초과근무");
	} else {
		System.out.println("정상근무");
	}
	
	if(workTime > 9 && workTime < 18) {
		System.out.println("True");
	} else {
		System.out.println("False");
	}
	
}
}
