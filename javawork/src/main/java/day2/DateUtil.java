package day2;

import java.time.LocalDate;
import java.util.Calendar;

public class DateUtil {
	public static void main(String[] args) {
		
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
		
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		LocalDate birth = LocalDate.of(2003, 10, 05);
		System.out.println(birth); 
	}
}
