package dateTimeAPI;

import java.time.LocalTime;

public class LocalTime2 {
public static void main(String[] args) {
	//gives current time
	LocalTime currentTime = LocalTime.now();
	System.out.println(currentTime);
	
	//to customize time
	LocalTime customized = LocalTime.of(6, 50);
	System.out.println(customized);
	
	//to convert String to int
	LocalTime parsedTime = LocalTime.parse("20:56:34");
	System.out.println(parsedTime);
}
}
