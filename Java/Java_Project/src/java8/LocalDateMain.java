package java8;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class LocalDateMain {

	public static void main(String[] args) {
		LocalDate today=LocalDate.now();
		System.out.println(today);
		
		LocalDate yesterday=LocalDate.of(2026, 11, 03);
		System.out.println(yesterday);
		
		
		LocalDate nextModuleStartDate=today.plus(17,ChronoUnit.DAYS);
		System.out.println(nextModuleStartDate);

	}

}
