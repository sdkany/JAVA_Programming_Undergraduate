package chapter06;
import java.util.*;
import java.util.stream.Stream;
public class Example38 {
	public static void main(String[] args) {
		// 创建一个List集合数据源
		List<String> list = Arrays.asList("张三","李四","张小明","张阳");
		// 1、直接使用Collection接口的parallelStream()创建并行流
		Stream<String> parallelStream = list.parallelStream();
		System.out.println(parallelStream.isParallel());
		// 创建一个Stream串行流
		Stream<String> stream = Stream.of("张三","李四","张小明","张阳");
		// 2、使用BaseStream接口的parallel()方法将串行流转变为并行流
		Stream<String> parallel = stream.parallel();
		System.out.println(parallel.isParallel());
	}
}

