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
		System.out.println(values);
		System.out.println("是否包含值：" + map.containsValue("Lucy"));
		System.out.println(map.keySet());
		System.out.println("是否包含key：" + map.containsKey("1"));
		System.out.println("删除指定的key对应的值为：" + map.remove("1"));
		System.out.println(map);
		// 遍历Map集合所有值对象V
		//values.forEach(v -> System.out.println(v));
	}
}

