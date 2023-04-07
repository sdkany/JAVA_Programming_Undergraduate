package chapter05;
public class Example04 {
	public static void main(String[] args) {
		String s = "     http :// localhost : 8080     ";
		// 字符串去除空格操作
		System.out.println("去除字符串两端空格后的结果:" + s.trim());
		// 字符串替换操作
		System.out.println("去除字符串中所有空格后的结果:" 
		                      + s.replace(" ", ""));
	}
}


