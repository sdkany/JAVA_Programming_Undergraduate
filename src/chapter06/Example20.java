package chapter06;
import java.util.*;
class CustomComparator implements Comparator { // 自定义比较器
	public int compare(Object obj1, Object obj2) {
		String key1 = (String) obj1;   // 将Object类型的参数强转为String类型
		String key2 = (String) obj2;
		return key2.compareTo(key1);   // 将比较之后的值返回
	}
}
public class Example20 {
	public static void main(String[] args) {
		Map map = new TreeMap(new CustomComparator()); // 创建TreeMap集合
		map.put("2", "Rose");
		map.put("1", "Jack");
		map.put("3", "Lucy");
		System.out.println(map);
	}
}
