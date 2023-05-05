package chapter06;
import java.util.*;
public class Example17 {
	public static void main(String[] args) {
		Map map = new HashMap(); // 创建Map集合
		map.put("1", "Jack");    // 存储元素
		map.put("2", "Rose");
		map.put("3", "Lucy");
		System.out.println(map);
		Collection values = map.values(); // 获取Map集合中value值集合对象
		// 遍历Map集合所有值对象V
		values.forEach(v -> System.out.println(v));
	}
}

