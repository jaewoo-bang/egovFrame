package day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 배열과반복문3 {
	public static void main(String[] args) {
		
		ArrayList<Integer> score = new ArrayList();
		score.add(5);
		score.add(4);
		score.add(2);
		score.add(5);
		score.add(1);
		
		List<Integer> list2 = (List<Integer>)Arrays.asList(4,5,3,2,5);
		//성적 5개
		
		
		//통과된 건수를 저장할 변수를 선언하고 0으로 초기화 
		int pass = 0;
//		
		//성적 출력
		for(int i = 0; i < score.size(); i++) {
			//출력
			System.out.println(score.get(i));
			//통과여부출력 ( 3점이상이면 success / fail )
			if (score.get(i) >= 3) {
				pass++;
				//통과건수 ++ 
			System.out.println("success");
			} else {
				System.out.println("fail");
			}
		} 
		System.out.println("통과건수 :" + pass);
		
		
	}
}
