package chapter06;
import java.util.*;
import java.util.stream.Stream;
public class Example32 {
	public static void main(String[] args) {
		Integer[] array = { 9, 8, 3, 5, 2 };       // 创建一个数组
		List<Integer> list = Arrays.asList(array); // 将数组转换为List集合
		// 1、使用集合对象的stream()静态方法创建Stream流对象
		Stream<Integer> stream = list.stream();
		stream.forEach(i -> System.out.print(i+" "));
		System.out.println();
		// 2、使用Stream接口的of()静态方法创建Stream流对象
		Stream<Integer> stream2 = Stream.of(array);
		stream2.forEach(i -> System.out.print(i+" "));
		System.out.println();
		// 3、使用Arrays数组工具类的stream()静态方法创建Stream流对象
		Stream<Integer> stream3 = Arrays.stream(array);
		stream3.forEach(i -> System.out.print(i+" "));
	}
}
