package chapter05;
import java.util.*;
public class Example20 {
	public static void main(String[] args) {
        // 获取表示当前时间的Calendar对象
		Calendar calendar = Calendar.getInstance();
		int year = calendar.get(Calendar.YEAR);       // 获取当前年份
		int month = calendar.get(Calendar.MONTH) + 1; // 获取当前月份
		int date = calendar.get(Calendar.DATE);       // 获取当前日
		int hour = calendar.get(Calendar.HOUR);       // 获取时
		int minute = calendar.get(Calendar.MINUTE);   // 获取分
		int second = calendar.get(Calendar.SECOND);   // 获取秒
		System.out.println("当前时间为:" + year + "年 " + month + "月 " 
		    + date + "日 "+ hour + "时 " + minute + "分 " + second + "秒");
	}
}

