package chapter05;
import java.time.*;
import java.time.format.*;
public class Example28 {
	public static void main(String[] args) {
		LocalDateTime date = LocalDateTime.now();
		// 1、使用常量创建DateTimeFormatter
	    System.out.print("使用常量创建DateTimeFormatter: ");
	    DateTimeFormatter dtf1 = DateTimeFormatter.ISO_DATE_TIME;
	    System.out.println(dtf1.format(date));
		// 2、使用Long类型风格的DateTimeFormatter
		System.out.print("使用MEDIUM类型风格的DateTimeFormatter: ");
		DateTimeFormatter dtf2 = DateTimeFormatter
				                   .ofLocalizedDateTime(FormatStyle.MEDIUM);
		System.out.println(dtf2.format(date));
		// 3、根据模式字符串来创建DateTimeFormatter格式器
		System.out.print("根据模式字符串来创建DateTimeFormatter: ");
		DateTimeFormatter dtf3 = DateTimeFormatter
				                   .ofPattern("yyyy-MM-dd HH:mm:ss");
		System.out.println(date.format(dtf3));
	}
}
