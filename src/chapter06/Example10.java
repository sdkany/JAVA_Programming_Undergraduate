package chapter06;
import java.util.HashSet;

class Student {
	String id;
	String name;		    		 
	public Student(String id, String name) {	     // 创建构造方法
		this.id=id;
		this.name = name;
	}
	public String toString() {			         // 重写toString()方法
		return id+":"+name;
	}
	public int hashCode() {    // 重写hashCode方法
		return id.hashCode();  // 返回id属性的哈希值
	}
	public boolean equals(Object obj) {     // 重写equals方法
		if (this == obj) {    // 判断是否是同一个对象
			return true;	  // 如果是，直接返回true
		}
		if (!(obj instanceof Student)) {	// 判断对象是为Student类型
			return false;	 // 如果对象不是Student类型，返回false
		}
		Student stu = (Student) obj;	    // 将对象强转为Student类型
	    boolean b = this.id.equals(stu.id);// 判断id值是否相同
		return b;	         // 返回判断结果
	}
}
public class Example10 {
	public static void main(String[] args) {
		HashSet hs = new HashSet();		           // 创建HashSet集合
		Student stu1 = new Student("1", "Jack");   // 创建Student对象
		Student stu2 = new Student("2", "Rose");
		Student stu3 = new Student("2", "Rose");
		Student stu4 = new Student("3", "Jack");
		hs.add(stu1);
		hs.add(stu2);
		hs.add(stu3);
		hs.add(stu4);
		System.out.println(hs);
	}
}

