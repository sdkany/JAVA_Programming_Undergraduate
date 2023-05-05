package chapter06;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class Example37 {
	public static void main(String[] args) {
		// 通过字符串源数据创建了一个Stream流对象
		Stream<String> stream = Stream.of("张三","李四","张小明","张阳");
		// 通过filter()方法筛选出字符串中以“张”开头的元素，
		// 最后通过collect()方法进行终结操作，将流元素收集到一个List集合中
		List<String> list = stream.filter(i -> i.startsWith("张"))
								   .collect(Collectors.toList());
		System.out.println(list);
		Stream<String> stream2 = Stream.of("张三","李四","张小明","张阳");
		// 通过filter()方法筛选出字符串中以“张”开头的元素，
	    // 通过collect()方法进行终结操作，将流元素使用" and "连接收集到一个字符串中
		String string = stream2.filter(i -> i.startsWith("张"))
				                  .collect(Collectors.joining(" and "));
		System.out.println(string);
	}
}

