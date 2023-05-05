package chapter06;
import java.util.ArrayList;
import java.util.Collections;
public class Example26 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		Collections.addAll(list, -3,2,9,5,8);  // 向集合中添加所有指定元素
		System.out.println("集合中的元素: " + list);
		System.out.println("集合中的最大元素: " + Collections.max(list));
		System.out.println("集合中的最小元素: " + Collections.min(list));
		Collections.replaceAll(list, 8, 0);   // 将集合中的8用0替换掉
		System.out.println("替换后的集合: " + list);
		Collections.sort(list);               //使用二分查找前，必须保证元素有序
		System.out.println("集合排序后为： "+list);
		int index = Collections.binarySearch(list, 9);
		System.out.println("集合通过二分查找方法查找元素9所在角标为："+index);
	}
}

