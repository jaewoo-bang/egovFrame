package day1;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * 요구사항 : 
 * 	1. 난수 6개 생성해서 리스트에 저장
 *  2. 1 ~ 15
 *  3. 중복값 허용 안됨
 */

public class 로또번호 {
	public static void main(String[] args) {
		//리스트 변수 선언 ==> 중복값 제거하려면 Set을 이용
		ArrayList<Integer> list = new ArrayList<Integer>();
		int num = 0;
		//while(list.size() < 6)
		while(list.size() < 6) {
			num = (int)(Math.random()*20) + 1;
			//난수생성(1 ~ 20)
			//리스트에 추가 ( add() )
			list.add(num);
		}
		System.out.println(list);
		//결과출력(sort)
		
	}
}
