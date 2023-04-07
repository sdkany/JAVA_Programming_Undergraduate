package chapter04.basic.example19;
//定义外部类Outer
class Outer {
	int m = 0;
	void test1(){
		System.out.println("外部类成员方法");
	}
	void test2() {
		// 1、定义局部内部类Inner，在局部内部类中访问外部类变量和方法
		class Inner {
			int n = 1;
			void show() {
				System.out.println("外部类变量m="+m);
				test1();
			}
		}
		// 2、在创建局部内部类的方法中，调用局部内部类变量和方法
		Inner inner = new Inner();
		System.out.println("局部内部类变量n="+inner.n);
		inner.show();
	}
}
//定义测试类
public class Example19 {
	public static void main(String[] args) {
		Outer outer= new Outer();
		outer.test2();    // 通过外部类对象调用创建了局部内部类的方法
	}
}

