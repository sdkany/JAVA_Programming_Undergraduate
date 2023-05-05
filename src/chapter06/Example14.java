package chapter06;
import java.util.HashMap;
import java.util.Map;
public class Example14 {
	public static void main(String[] args) {
		// 创建HashMap对象
        Map map = new HashMap();  
		// 1、向Map存储键值对元素
		map.put("1", "Jack");        
		map.put("2", "Rose");
		map.put("3", "Lucy");
		map.put("4", "Lucy");
		map.put("1", "Tom");
		System.out.println(map);
		// 2、查看键对象是否存在
		System.out.println(map.containsKey("1"));
		// 3、获取指定键对象映射的值
		System.out.println(map.get("1")); 
		// 4、获取集合中的键对象和值对象集合
		System.out.println(map.keySet()); 
		System.out.println(map.values());
		// 5、替换指定键对象映射的值
		map.replace("1", "Tom2");
		System.out.println(map);
		// 6、删除指定键对象映射的键值对元素
		map.remove("1");
		System.out.println(map);
	}
}

