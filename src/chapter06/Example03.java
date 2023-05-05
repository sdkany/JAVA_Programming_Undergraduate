package chapter06;
import java.util.ArrayList;
import java.util.Iterator;
public class Example03 {
	public static void main(String[] args) {
        // 创建ArrayList集合
		ArrayList list = new ArrayList();   
        // 向该集合中添加字符串
		list.add("data_1");                    
		list.add("data_2");
		list.add("data_3");
     	// 获取Iterator对象
		Iterator iterator = list.iterator(); 
    	// 判断集合中是否存在下一个元素
		while (iterator.hasNext()) {         
			Object obj = iterator.next();   // 取出ArrayList集合中的元素
//			if((String) obj == "data_1"){  // 使用Iterator时添加删除操作
//				list.remove(obj);
//			}
			System.out.println(obj);
		}
	}
}


