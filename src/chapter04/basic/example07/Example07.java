package chapter04.basic.example07;
//定义Animal类
class Animal {
	// 重写Object类的toString()方法
	@Override
	public String toString() {     
		return "这是一只动物";
	}
}
//定义测试类
public class Example07 {
	public static void main(String[] args) {
		Animal animal = new Animal();          // 创建Animal对象
		System.out.println(animal.toString()); // 打印animal的toString()
	}
}


