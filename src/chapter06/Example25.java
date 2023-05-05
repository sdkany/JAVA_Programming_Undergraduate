package chapter06;
import java.util.ArrayList;
import java.util.Collections;
public class Example25 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		Collections.addAll(list, "C","Z","B","K");    // 添加元素
		System.out.println("排序前: " + list);          // 输出排序前的集合
		Collections.reverse(list);                    // 反转集合
		System.out.println("反转后： " + list); 
		Collections.sort(list);                       // 按自然顺序排列
		System.out.println("按自然顺序排序后: " + list);
		Collections.shuffle(list);                    // 随机打乱集合元素
		System.out.println("按随机顺序排序后: " + list); 
		Collections.swap(list, 0, list.size()-1);     // 将集合首尾元素交换
		System.out.println("集合首尾元素交换后: " + list); 
	}
}

