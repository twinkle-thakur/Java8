package dateTimeAPI;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTime4 {
public static void main(String[] args) {
	ZonedDateTime now = ZonedDateTime.now();
	System.out.println(now);
	
	ZonedDateTime usaTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
	System.out.println(usaTime);
}
}
