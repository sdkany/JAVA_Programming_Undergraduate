package chapter03.basic.example03;
class Person{
	String name;
    int age;
	public void speak(){
		System.out.println("我叫"+name+",今年"+age+"岁了");
	}
}
public class Example03 {
	public static void main(String[] args) {
		Person p = new Person();
		p.name = "张三";
		p.age = -18;
		p.speak();
	}
}

