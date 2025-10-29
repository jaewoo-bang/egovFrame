package day1;

import java.util.HashMap;
import java.util.Set;

public class 맵 {
	public static void main(String[] args) {
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		
		//추가
		map.put(100, "홍길동");
		map.put(110, "나길동");
		map.put(120, "김길동");
		
		//삭제 
		map.remove(110);
		System.out.println("삭제 후: " + map);
		
		//변경
		map.put(110, "이순신");
		System.out.println("변경 후: " + map);
		
		//검색 (사원번호 120 조회)
		System.out.println("120번 사원은 " + map.get(120) );
		
		//전체조회  -> key 전체를 list로 변환해서
		Set<Integer> keys = map.keySet();
		for(Integer key : keys) {
			System.out.println(key + " : " + map.get(key));
		}
	}
}
