package chapter05;
import java.text.*;
public class Example25 {
	public static void main(String[] args) throws ParseException {
		// 创建DateFormat对象
		DateFormat dt1 = DateFormat.getDateInstance();
		// 创建Long格式的DateFormat对象
		DateFormat dt2 = DateFormat.getDateInstance(DateFormat.LONG);
		// 定义两个日期格式的字符串
		String str1 = "2018-01-27";
		String str2 = "2018年01月27日";
		// 输出对应格式的字符串解析成Date对象后的结果
		System.out.println(dt1.parse(str1));
		System.out.println(dt2.parse(str2));
	}
}
