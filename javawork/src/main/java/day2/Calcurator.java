package day2;

/*
 *  두 수의 덧셈과 뺄셈을 수행하는 계산기
 */

public class Calcurator {
	//필드
	int num1;
	int num2;
	int result;
	
	//생성자
	public Calcurator() {}
	public Calcurator(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}
	
	//메서드
	public void add() { result = num1 + num2; }
	public void mul() { result = num1 * num2; }
	
}
