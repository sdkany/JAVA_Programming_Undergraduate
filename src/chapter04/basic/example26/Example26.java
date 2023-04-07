package chapter04.basic.example26;
//定义一个函数式接口
@FunctionalInterface
interface PersonBuilder {
	Person buildPerson(String name);
}
//定义一个Person类，并添加有参构造方法
class Person {
	private String name;
	public Person(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
}
//定义测试类
public class Example26 {
	public static void printName(String name, PersonBuilder builder) {
		System.out.println(builder.buildPerson(name).getName());
	}
	public static void main(String[] args) {
		// 使用Lambda表达式方式
		printName("赵丽颖", name -> new Person(name));
		// 使用构造器引用的方式
		printName("赵丽颖", Person::new);
	}
}


