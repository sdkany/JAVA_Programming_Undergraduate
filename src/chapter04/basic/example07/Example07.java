package chapter04.basic.example07;

import java.util.Objects;

//定义Animal类
class Animal {
	private String name;
	private int age;

	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Animal{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Animal animal = (Animal) o;
		return age == animal.age && Objects.equals(name, animal.name);
	}

	//	// 重写Object类的toString()方法
//	@Override
//	public String toString() {
//		return "这是一只动物";
//	}
}
//定义测试类
public class Example07 {
	public static void main(String[] args) {
		Animal animal = new Animal("大黄", 8);          // 创建Animal对象
		System.out.println(animal.toString()); // 打印animal的toString()
	}
}


