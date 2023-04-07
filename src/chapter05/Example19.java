package chapter05;
import java.util.*;
public class Example19 {
	public static void main(String[] args) {
		// 创建表示当前时间的Date对象
		Date date1 = new Date();
		// 获取当前时间后1秒的时间
		Date date2 = new Date(System.currentTimeMillis() + 1000);
		System.out.println(date1);
		System.out.println(date2);
	}
}

