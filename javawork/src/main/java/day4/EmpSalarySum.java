package day4;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import day3.emp.Employee;

/* 사원 급여 합계 계산 
 * data (필드)
 * 		List
 * 
 */

public class EmpSalarySum {
	public static void main(String[] args) throws IOException {
		// emp.txt
		// 1. scanner
		Scanner sc = new Scanner(new File("c:/Temp/emp.txt"));
		List<Employee> list = new ArrayList<>();
		
		int sum = 0;
		// 2. 라인만큼 반복문
		
		while (sc.hasNext()) {
			// 3. 사번, 이름, 급여출력

			String[] arr = sc.nextLine().split(",");
			int id = Integer.parseInt(arr[0]);
			String name = arr[1];
			long sal =  Long.parseLong(arr[7]);
			list.add(new Employee(id, name, sal));
			// 4. 급여합계 계산, 출력
			System.out.println(arr[7]);
			sum = sum + Integer.parseInt(arr[7]);
		}
		//급여순으로 정렬해서 출력
		Comparator<Employee> compare =  (o1, o2) -> (int)(o1.getSalary() - o2.getSalary());
		list.sort( (o1, o2) -> (int)(o1.getSalary() - o2.getSalary()));
		for(Employee emp : list) {
			System.out.println(emp);
		}
		System.out.println("========");
		//스트림
		list.stream().sorted(compare).forEach(e -> System.out.println(e));
		//	.forEach(System.out::println)
		//list.stream().sorted().foreach()
	}
}
		
			
