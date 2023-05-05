	package chapter06;
import java.util.LinkedList;
public class Example02 {
	public static void main(String[] args) {
		LinkedList link = new LinkedList();  // 创建LinkedList集合
		// 1、添加元素
		link.add("stu1");
		link.add("stu2");
         System.out.println(link); // 输出集合中的元素
		link.offer("offer");       // 向集合尾部追加元素
		link.push("push");         // 向集合头部添加元素
		System.out.println(link);  // 输出集合中的元素
		// 2、获取元素
        Object object = link.peek();//获取集合第一个元素
		System.out.println(object); // 输出集合中的元素
		// 3、删除元素
		link.removeFirst();        // 删除集合第一个元素
		link.pollLast();           // 删除集合最后一个元素
		System.out.println(link);
	}
}

