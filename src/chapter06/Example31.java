package chapter06;
import java.util.*;
import java.util.stream.Stream;
public class Example31 {
	public static void main(String[] args) {
          // 创建一个List集合对象
		List<String> list = new ArrayList<>(); 
		list.add("张三");
		list.add("李四");
		list.add("张小明");
		list.add("张阳");
		// 1、创建一个Stream流对象
		Stream<String> stream = list.stream();
		// 2、对Stream流中的元素分别进行过滤、截取操作
		Stream<String> stream2 = stream.filter(i -> i.startsWith("张"));
		Stream<String> stream3 = stream2.limit(2);
		// 3、对Stream流中的元素进行终结操作，进行遍历输出
		stream3.forEach(j -> System.out.println(j));
		System.out.println("=======");
         // 通过链式表达式的形式完成聚合操作
		list.stream().filter(i -> i.startsWith("张"))
					 .limit(2)
					 .forEach(j -> System.out.println(j));
	}
}


