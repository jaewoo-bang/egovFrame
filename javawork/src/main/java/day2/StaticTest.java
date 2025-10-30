package day2;

/*
 * static(정적) 필드, 메서드
 */

public class StaticTest {
	public static void main(String[] args) {

		//static 클래스이름 접근가능. 객체생성없이 사용가능
		Student.schoolName = "영진";
		
		Student s1 = new Student(1,"둘리");
		Student s2 = new Student(2,"고길동");
		
		System.out.println(s1.name);
		System.out.println(s1.schoolName);
		
		System.out.println(s2.name);
		System.out.println(s2.schoolName);

	}
	
}
