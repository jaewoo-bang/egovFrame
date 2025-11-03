package day4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest {
	public static int menuInput()
			throws InputMismatchException, MenuException {
		Scanner sc = new Scanner(System.in);
		System.out.print("가위(1), 바위(2), 종료(0): ");
		int user;
		user = sc.nextInt();			
		if(user > 3) {
			throw new MenuException("입력범위오류"); //업무규칙위배
		}
		return user;			
		}
	
	public static void main(String[] args) {	//InputMismatchException
		int menu = 0;
		try {
			menu = menuInput();
		} catch (InputMismatchException e) {	//InputMismatchException
			System.out.println(e.getMessage());
			menu = 0;
		} catch (MenuException e) {	//InputMismatchException
			System.out.println(e.getMessage());
			menu = 1;
		}
		 catch (Exception e) {	//InputMismatchException
		System.out.println(e.getMessage());
		menu = 1;
		}
		System.out.println(menu);		
		System.out.println("the end");
	}
}
