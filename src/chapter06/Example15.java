package chapter06;
import java.util.*;
public class Example15 {
	public static void main(String[] args) {
		Map map = new HashMap();            // 创建Map集合
		map.put("1", "Jack");               // 存储元素
		map.put("2", "Rose");
		map.put("3", "Lucy");
		System.out.println(map);
		Set keySet = map.keySet();  // 1、使用keySet()方法，获取键的集合
		Iterator it1 = keySet.iterator();   // 迭代键的集合
		while (it1.hasNext()) {
			Object key = it1.next();
			Object value = map.get(key);   // 获取每个键所对应的值
			System.out.println(key + ":" + value);
		}
		Set entrySet = map.entrySet();  // 2、使用entrySet()方法
		Iterator it2 = entrySet.iterator();            // 获取Iterator对象
		while (it2.hasNext()) {
              // 获取集合中键值对映射关系
			Map.Entry entry = (Map.Entry) (it2.next());
			Object key = entry.getKey();              // 获取Entry中的键
			Object value = entry.getValue();          // 获取Entry中的值
			System.out.println(key + ":" + value);
		}
	}
}
