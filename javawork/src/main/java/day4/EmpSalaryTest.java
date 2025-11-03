package day4;

/*
 * 클래스에서 기능만들어서 메인에서 재사용
 */

public class EmpSalaryTest {
	public static void main(String[] args) {
		EmpSalary empSalary = new EmpSalary("c:/Temp/emp.txt");
		empSalary.init();
		empSalary.cal();
		empSalary.sort();
		empSalary.print();
		System.out.println("급여합계="+empSalary.getSum());
	}
}
