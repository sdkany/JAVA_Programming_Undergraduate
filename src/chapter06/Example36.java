package chapter06;
import java.util.stream.Stream;
public class Example36 {
	public static void main(String[] args) {
		// 通过字符串源数据创建了一个Stream流对象
		Stream<String> stream = Stream.of("张三","李四","张小明","张阳");
		stream.skip(1)						 // 跳过流中的前1个元素
		      .limit(2)                      // 截取流中的前2个元素
		      .forEach(System.out::println); // 对流元素进行遍历输出
	}
}
