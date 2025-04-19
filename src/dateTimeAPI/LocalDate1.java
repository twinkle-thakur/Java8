package dateTimeAPI;

import java.time.LocalDate;

public class LocalDate1 {
public static void main(String[] args) {
	//1)gives current date
	LocalDate now = LocalDate.now();
	System.out.println(now);
	//within same date we can see year, month and day
	System.out.println(now.getYear());
	System.out.println(now.getDayOfMonth());
	System.out.println(now.getMonth());
	System.out.println(now.getMonthValue());
	
	//To get prev. day from current date
	LocalDate yesterday = now.minusDays(1);
	System.out.println(yesterday);
	
	//3)If we want to customize date
	LocalDate customized = LocalDate.of(2011, 4, 5);
	System.out.println(customized);
	
	
	
	
	
}
}
