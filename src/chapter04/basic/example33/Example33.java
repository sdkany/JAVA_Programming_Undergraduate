package chapter04.basic.example33;
public class Example33 {
    // 下面的方法实现了两个整数相除，并使用throws关键字声明抛出异常
	public static int divide(int x, int y) throws Exception {
		int result = x / y;          // 定义一个变量result记录两个数相除的结果
		return result;               // 将结果返回
	}
	public static void main(String[] args) throws Exception {
         // 调用divide()方法，并使用throws关键字继续将异常抛出
		int result = divide(4, 0);  
		System.out.println(result);
	}
}


