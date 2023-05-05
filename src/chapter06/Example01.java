package chapter06;
import java.util.ArrayList;
public class Example01 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList(); // 创建ArrayList集合
		list.add("stu1"); // 向集合中添加元素
		list.add("stu2");
		list.add("stu3");
		list.add("stu4");
		for (int i = 0; i < list.size(); i++) {
			System.out.println("第" + (i + 1) + "个元素是：" + list.get(i));
		}
	}
}

