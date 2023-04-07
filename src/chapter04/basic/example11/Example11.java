package chapter04.basic.example11;
public class Example11 {
	// final修饰的成员变量，必须在声明的同时进行赋值，否则编译错误
//	final int m;
	final int m = 0;  // 为final修饰的成员变量m初始化赋值
	public static void main(String[] args) {
		// final修饰的局部变量，可以先声明，再进行一次赋值
		final int n; 
		n = 4; 
	}
}

