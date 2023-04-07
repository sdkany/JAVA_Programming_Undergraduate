package com.itheima.example14;
//定义了Animal接口
interface Animal {
	int ID = 1;       // 定义全局常量
	void breathe();  // 定义抽象方法breathe()
	// 定义一个默认方法
	default void getType(String type){
		System.out.println("该动物属于："+type);
	}
	// 定义一个静态方法
	static int getID(){
		return Animal.ID;
	}
}
//定义了LandAnimal接口,并继承了Animal接口
interface LandAnimal extends Animal {
	void run();      // 定义抽象方法run()
}
//Dog类实现了LandAnimal接口
class Dog implements LandAnimal {
	// 实现breathe()方法
	public void breathe() {
		System.out.println("狗在呼吸");
	}
	// 实现run()方法
	public void run() {
		System.out.println("狗在陆地上跑");
	}
}
//定义测试类
public class Example14 {
	public static void main(String args[]) {
		System.out.println(Animal.getID()); // 通过接口名调用类方法
		Dog dog = new Dog();          // 创建Dog类的实例对象
		System.out.println(dog.ID);   // 在实现类中获取接口全局常量
		dog.breathe();                // 调用dog对象的breathe()方法
		dog.getType("犬科");           // 通过dog对象，调用接口默认方法
		dog.run();                    // 调用dog对象的run()方法
	}
}
