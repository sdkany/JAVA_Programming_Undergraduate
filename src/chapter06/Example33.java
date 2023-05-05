package chapter06;
import java.util.stream.Stream;
public class Example33 {
	public static void main(String[] args) {
		// 通过字符串源数据创建了一个Stream流对象
		Stream<String> stream = Stream.of("张三","李四","张小明","张阳");
		// 通过forEach方法遍历Stream流对象中的元素
		stream.forEach(i -> System.out.println(i));
	}
}

