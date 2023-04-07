package chapter04.basic.example08;
//使用final关键字修饰Animal类
/*final*/ class Animal {
}
//Dog类继承Animal类
class Dog extends Animal {
}
//定义测试类
public class Example08 {
	public static void main(String[] args) {
		Dog dog = new Dog(); // 创建Dog类的实例对象
	}
}
