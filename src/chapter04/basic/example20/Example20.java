package chapter04.basic.example20;
//定义外部类Outer
class Outer {
	static int m = 0; // 定义外部类静态变量m
	static class Inner {
		void show() {
			// 静态内部类访问外部类静态成员
			System.out.println("外部类静态变量m="+m);
		}
	}
}
//定义测试类
public class Example20 {
	public static void main(String[] args) {
		// 静态内部类可以直接通过外部类创建
		Outer.Inner inner = new Outer.Inner(); 
		inner.show();
	}
}
