package day1;

import java.util.Scanner;

public class 숫자맞추기 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int user = 0;
		int computer = 0;
		int count = 0;
	
		//반복문무한루프
		while(true) {
			
			//메뉴출력
			System.out.println("숫자입력:");
			
			if(user == computer) {
				System.out.println("정답입니다!");
			
				computer = (int)(Math.random()*100) + 1;
			} else if  (user < computer)
							
			 {
				System.out.print("Up");
				computer = (int)(Math.random()*100) + 1;
				
			} else {
				System.out.println("down");
				computer = (int)(Math.random()*100) + 1;
			}
			//사용자 값을 입력
			user = scanner.nextInt();
			computer = (int)(Math.random()*100) + 1;
			//0이면 종료
			
			//1~3이 아니면 다시 입력
			if(user==0) break;
			System.out.print("게임을 종료합니다");
		}
	}
}
