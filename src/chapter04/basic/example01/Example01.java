package chapter04.basic.example01;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

//定义Animal类
class Animal {
	String name; // 声明name属性
	// 定义动物叫的方法
	void shout() {
		System.out.println("动物发出叫声");
	}
}
//定义Dog类继承Animal类
class Dog extends Animal {
	private String color;
	// 定义color的set和get方法
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	// 定义一个打印name的方法
	public void printName() {
		System.out.println("name=" + name);
	}
}
//定义测试类
public class Example01 {
	public static void main(String[] args) {
		Dog dog = new Dog();  // 创建一个Dog类的实例对象
		dog.setColor("Black"); // 设置dog的color为Black
		System.out.println("狗的颜色为：" + dog.getColor());
	}
}

