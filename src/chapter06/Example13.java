package chapter06;
import java.util.Comparator;
import java.util.TreeSet;
public class Example13 {
	public static void main(String[] args) {
		// 1、创建集合时，传入Comparator匿名内部类定制排序方式
		TreeSet ts = new TreeSet(new Comparator(){  //
			public int compare(Object obj1, Object obj2) {
				String s1 = (String) obj1;
				String s2 = (String) obj2;
				int temp = s1.length() - s2.length();
				return temp;
			}
		});
		ts.add("Jack"); ts.add("Helena"); ts.add("Eve");
		System.out.println(ts);
		// 2、创建集合时，使用Lambda表达式定制排序规则
		TreeSet ts2 = new TreeSet((obj1, obj2) -> {
			String s1 = (String) obj1;
			String s2 = (String) obj2;
			return s2.length() - s1.length();
		});
		ts2.add("Jack"); ts2.add("Helena"); ts2.add("Eve");
		System.out.println(ts2);
	}
}


