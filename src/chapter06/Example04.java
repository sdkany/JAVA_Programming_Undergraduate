package chapter06;
import java.util.ArrayList;
public class Example04 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList(); // 创建ArrayList集合
		list.add("data_1");				  // 向ArrayList集合中添加字符串元素
		list.add("data_2");
		list.add("data_3");		
		for (Object obj : list) {		  // 使用foreach循环遍历ArrayList对象
			System.out.println(obj);	  // 取出并打印ArrayList集合中的元素
		}
	}
}
