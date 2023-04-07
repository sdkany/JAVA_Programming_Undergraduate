package chapter03.basic.example14;
class Person{
	{
		System.out.println("执行了Person类中的成员代码块");
	}

	static {
		System.out.println("执行了Person类中的静态代码块");
	}

	public Person() {
		System.out.println("执行了Person类中的构造函数");
	}

	public static void exec(){
		System.out.println("执行了Person类中的静态方法");
	}
}

public class Example14{
	static{
		System.out.println("执行了测试类中的静态代码块");
	}
	public static void main(String[] args){
		// 实例化2个Person对象
		//Person p1 = new Person();
		//Person p2 = new Person();
		//System.out.println("没有实例化Person对象或者执行Person中的静态代码");
		Person.exec();
	}
}

