package chapter05;
import java.time.*;
import java.time.format.*;
public class Example29 {
	public static void main(String[] args) {
		// 定义两种日期格式的字符串
		String str1 = "2018-01-27 12:38:36";
		String str2 = "2018年01月29日 15时01分20秒";
		// 定义解析所用的格式器
		DateTimeFormatter formatter1 = DateTimeFormatter
				             .ofPattern("yyyy-MM-dd HH:mm:ss");
		DateTimeFormatter formatter2 = DateTimeFormatter
				             .ofPattern("yyyy年MM月dd日 HH时mm分ss秒");
		// 使用LocalDateTime的parse()方法执行解析
		LocalDateTime localDateTime1 = LocalDateTime
                                                   .parse(str1, formatter1);
		LocalDateTime localDateTime2 = LocalDateTime
                                                   .parse(str2, formatter2);
		// 输出结果
		System.out.println(localDateTime1);
		System.out.println(localDateTime2);
	}
}

