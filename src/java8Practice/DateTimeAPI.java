package java8Practice;

import java.time.LocalDate;

public class DateTimeAPI {
	public static void main(String[] args) {
		LocalDate dob = LocalDate.of(2004, 04, 14);
		LocalDate now = LocalDate.now();
		LocalDate age = now.minusYears(dob.getYear());
		System.out.println(age.getYear());
	}
}
