package day3.haksa;

import java.util.ArrayList;



//패키지, import
public class Main {
	public static void main(String[] args) {
		
		//부모타입의 참조변수가 자식객체를 참조할 수 있다.(자동 형변환)
		Member student = new Student(1, "고길동", 4);
		Member professor = new Professor(100, "나교수", 4000);
		
		ArrayList<Member> list = new ArrayList<Member>();
		list.add(student);
		list.add(professor);
		
		for(Member member : list) {
			//다형성 : 참조하는 자식객체의 메서드를 호출 => 실행결과 다르게
			System.out.println(member.toString());
		}
		for(Member member : list) {
			//다형성 : 참조하는 자식객체의 메서드를 호출 => 실행결과 다르게
			System.out.println(member.name);	//Member 필드만 보임
			if(member instanceof Student) {
				Student temp =  (Student)member;	//강제형변환
				System.out.println(temp.getGrade());
			} else {
				Professor temp = (Professor) member; //강제 형변환
				System.out.println(temp.salary);
				//교수타입 형변환 -? 
			}
//			System.out.println( (member instanceof Student) ?
//					((Student)member).getGrade() :
//					((Professor)member).salary );
		}
//		Object object = null;
	
	}
}
