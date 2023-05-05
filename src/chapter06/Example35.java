package chapter06;
import java.util.stream.Stream;
public class Example35 {
	public static void main(String[] args) {
		// 通过字符串源数据创建了一个Stream流对象
		Stream<String> stream = Stream.of("a1", "a2", "b1", "c2", "c1");
		stream.filter(s -> s.startsWith("c")) // 筛选出流中以“c”开头的元素
		      .map(String::toUpperCase)       // 对流元素进行映射，将全部字符改为大写
		      .sorted()                       // 对流元素进行排序
		      .forEach(System.out::println);  // 对流元素进行遍历输出
	}
}
