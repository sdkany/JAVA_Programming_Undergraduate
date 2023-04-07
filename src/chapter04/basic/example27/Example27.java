package chapter04.basic.example27;
//定义一个函数式接口
@FunctionalInterface
interface Printable{
	void print(StringUtils su, String str);
}
class StringUtils {
	public void printUpperCase(String str) {
		System.out.println(str.toUpperCase());
	}
}
//定义测试类
public class Example27 {
	private static void printUpper(StringUtils su, String text, 
								Printable pt) {
		pt.print(su, text); 
	}
	public static void main(String[] args) {
		// 使用Lambda表达式方式
		printUpper(new StringUtils(), "Hello",
                                  (object, t) -> object.printUpperCase(t));
		// 使用方法引用的方式
	  printUpper(new StringUtils(), "Hello",
                                  StringUtils::printUpperCase);
	}
}


