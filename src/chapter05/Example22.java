package chapter05;
import java.util.*;
public class Example22 {
	public static void main(String[] args) {
		// 获取表示当前时间的Calendar对象
		Calendar calendar = Calendar.getInstance();
		// 设置指定日期,将MONTH设为13
		calendar.set(Calendar.MONTH, 13);
		System.out.println(calendar.getTime());
		// 开启non-lenient模式
		calendar.setLenient(false);
		calendar.set(Calendar.MONTH, 13);
		System.out.println(calendar.getTime());
	}
}

