package chapter04.basic.example25;
//定义一个函数式接口
@FunctionalInterface
interface Printable{
	void print(String str);
}
class StringUtils {
	public void printUpperCase(String str) {
		System.out.println(str.toUpperCase());
	}
}
//定义测试类
public class Example25 {
	private static void printUpper(String text, Printable pt) {
		pt.print(text); 
	}
	public static void main(String[] args) {
		StringUtils stu = new StringUtils();
		// 使用Lambda表达式方式
		printUpper("Hello", t -> stu.printUpperCase(t));
		// 使用方法引用的方式
		printUpper("Hello", stu::printUpperCase);
	}
}

