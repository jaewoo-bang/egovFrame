package game;

import java.util.Random;
import java.util.Scanner;
// 1. 클래스(설계도) 선언
public class RockPaperScissors {
	int win, lose, draw, user, computer ;
	public void start() {
		Scanner scanner = new Scanner(System.in);
	
	void computerChoice() {
		computer = (int)(Math.random()*3)+1;
	}
	
	//승패 판정로직
	void WinOrLose() {
		if (user == computer) {
			draw++;
			System.out.println("무승부!");
		}
		else if ((user==1 && computer==2) || (user==2 && computer==1)
				|| (user==3 && computer==2)) {
			win++;
			System.out.println("사용자 승리!");
		} else {
			lose++;
			System.out.println("컴퓨터 승리!");
	}
	
	//최종 결과 출력
	void printFinal() {
		System.out.println("최종 결과:"+ win + "승 " + draw + "무 " + lose + "패");
	}
	
	//현재 전적 출력
	void printReport() {
		System.out.println("현재 전적:"+ win + "승 " + draw + "무 " + lose + "패");
	}


		//승/패/무승부 카운터 초기화
		win = 0;
		lose = 0;
		draw = 0;
		
		System.out.println("가위바위보 게임 시작!");
		
		//무한루프(0이 입력되기전까지)
		while (true) {
			
			//사용자 입력
			System.out.print("가위(1), 바위(2), 보(3), 종료(0): ");
			user  = scanner.nextInt();
			
			//0이면 종료
			if (user == 0) {
				System.out.println("게임종료");
				break;
			}

			//1,2,3이 아니면 다시 입력
			if (user > 3) {
				System.out.println("잘못된 입력입니다.");
				continue;
			}
			
			//컴퓨터의 선택 생성
			computerChoice();
			
			//사용자와 컴퓨터 선택 출력
			System.out.println("사용자:"+ user + " 컴퓨터:" + computer);

			//승패 판정 로직
			WinOrLose();
			}
			
			//현재 전적 출력
			printReport();
		}
		
		//전체 결과 요약 출력
		printFinal();
	}
}
