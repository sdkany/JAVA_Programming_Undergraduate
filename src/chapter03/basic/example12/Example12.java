package chapter03.basic.example12;
class Student {
	static String schoolName;  // 声明静态变量schoolName
}
public class Example12 {
	public static void main(String[] args) {
		Student stu1 = new Student();	    // 创建第1个学生对象
		Student stu2 = new Student();       // 创建第2个学生对象
		Student.schoolName = "清华大学";		// 为静态变量赋值
		// 分别输出两个学生对象的信息
		System.out.println("我是" + stu1.schoolName+"的学生");	
		System.out.println("我是" + stu2.schoolName+"的学生"); 
	}
}


