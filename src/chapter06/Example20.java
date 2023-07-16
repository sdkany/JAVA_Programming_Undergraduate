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
		map.put("2", new Integer(222));
		map.put("1", new Integer(111));
		map.put("3", new Integer(3333));
		System.out.println(map);

		// map
		TreeSet<Integer> map2 = new TreeSet<Integer>(new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				int a = (int) o1;
				int b = (int) o2;
				if(a > b)
					return -1;
				else if (a == b)
					return 0;
				else
					return 1;
			}
		});
		map2.add(5);
		map2.add(4);
		map2.add(1);
		map2.add(2);
		map2.add(3);

		System.out.println(map2.first());

		//Map map1 = new HashMap((Object x,Object y) -> return 1;)
		Enumeration enumeration = System.getProperties().propertyNames();
		while(enumeration.hasMoreElements()){
			String key = (String) enumeration.nextElement();
		}
	}
}
