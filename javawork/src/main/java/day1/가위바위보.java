package day1;

import java.util.Scanner;

public class 가위바위보 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int user = 0;
		int computer = 0;
		int win = 0;
		int lose = 0;
		int draw = 0;
		
		//반복문무한루프
		while(true) {
			
			//메뉴출력
			System.out.println("1가위 2바위 3보 0종료");
//			System.out.println("사용자:", user, "컴퓨터:", computer);
			if(user == computer) {
				System.out.println("무승부");
				
				draw++; 
				computer = (int)(Math.random()*3) + 1;
			} else if  (user == 1 && computer == 3 ||
						user == 2 && computer == 1 ||
						user == 3 && computer == 2) 
			 {
				System.out.print("사용자 승리");
				win++;
				
			} else {
				System.out.println("컴퓨터 승리");
				lose++;
			}
			//사용자 값을 입력
			user = scanner.nextInt();
			computer = (int)(Math.random()*3) + 1;
			//0이면 종료
			if(user == 0) break; 
			
			//1~3이 아니면 다시 입력
			if( user > 3) continue;
		}
	}
}
