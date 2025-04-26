package dateTimeAPI;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeFormater {
public static void main(String[] args) {
	LocalDate now = LocalDate.now();
	System.out.println(now);//this date format is fixed i,e. 2025-04-20 
	String date="2025-04-20";
	LocalDate parsed = LocalDate.parse(date);//String is parsed to int 
	System.out.println(parsed);
	//but if i write wrong formate in String then it would give exception
	String date2="20/04/2003";
	LocalDate parsed2 = LocalDate.parse(date);//this will excep
	//to remove this we use DateTimeFormatter
	DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");//this format will be userdefined
	LocalDate parsed3 = LocalDate.parse(date2, format);
	System.out.println(parsed3);//date2 has been parsed but o/p formate will be same
	
}
}
