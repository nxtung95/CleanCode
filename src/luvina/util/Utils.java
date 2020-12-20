package luvina.util;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Utils {
    private static final String FORMAT_DATE = "yyyyMMdd";
    
	public static Period getPeriodDate(String date) {
    	DateTimeFormatter formatter = DateTimeFormatter.ofPattern(FORMAT_DATE);
    	LocalDate dateFormat = LocalDate.parse(date, formatter);
    	LocalDate currentDate = LocalDate.now();
    	return Period.between(dateFormat, currentDate);
	}
}
