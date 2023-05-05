package chapter06;
import java.util.ArrayList;
public class Example23 {
	public static void main(String[] args) {
//		ArrayList list = new ArrayList();	 // 创建ArrayList集合
		ArrayList<String> list = new ArrayList<String>();// 创建集合对象并指定泛型为String
		list.add("String");					// 添加字符串对象
		list.add("Collection");				
		//list.add(Integer.valueOf(1));		// 添加Integer对象
		for (Object obj : list) {			// 遍历集合
			String str = (String) obj;		// 强制转换成String类型
			System.out.println(str);
		}
	}
}

