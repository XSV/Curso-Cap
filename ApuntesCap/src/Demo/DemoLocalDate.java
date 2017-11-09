package Demo;
import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.MonthDay;
import java.time.ZoneId;
import java.util.Locale;
public class DemoLocalDate {
	//https://docs.oracle.com/javase/tutorial/datetime/iso/timezones.html
	public static void main(String[] args) {
		LocalDate fechaActual=LocalDate.now();
		Locale locale = Locale.getDefault();
		fechaActual=fechaActual.plusDays(1);
		DayOfWeek x = fechaActual.getDayOfWeek();
		/*
		System.out.println(fechaActual.getDayOfWeek());
		System.out.println(fechaActual.getDayOfMonth());
		System.out.println(x.getDisplayName(TextStyle.FULL, locale));
		System.out.println(x.getDisplayName(TextStyle.NARROW, locale));
		System.out.println(x.getDisplayName(TextStyle.SHORT, locale));
		*/
		
		MonthDay date = MonthDay.of(Month.FEBRUARY, 29);
		boolean validLeapYear = date.isValidYear(2010);		
		/*
		System.out.println(validLeapYear);
		System.out.println(Year.of(2012).isLeap());
		*/
		
		
		System.out.printf("now: %s%n", LocalDateTime.now());
		System.out.printf("Apr 15, 1994 @ 11:30am: %s%n",LocalDateTime.of(1994, Month.APRIL, 15, 11, 30));
		System.out.printf("now (from Instant): %s%n",LocalDateTime.ofInstant(Instant.now(), ZoneId.systemDefault()));
		System.out.printf("6 months from now: %s%n",LocalDateTime.now().plusMonths(6));
		System.out.printf("6 months ago: %s%n",LocalDateTime.now().minusMonths(6));
		
		
		
		
	}}
