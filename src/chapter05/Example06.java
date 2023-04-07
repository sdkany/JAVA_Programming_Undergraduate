package chapter05;
public class Example06 {
	public static void main(String[] args) {
		String str = "2018-01-24";
		// 下面是字符串截取操作
		System.out.println("从第6个字符截取到末尾的结果：" 
		                       + str.substring(5));
		System.out.println("从第6个字符截取到第7个字符的结果：" 
		                       +str.substring(5, 7));
		// 下面是字符串分割操作
		System.out.print("分割后的字符串数组中的元素依次为:");
		// 通过横线连接符“—”将字符串转换为字符串数组
		String[] strArray = str.split("-");
		// 循环输出数组中的元素
		for (int i = 0; i < strArray.length; i++) {
			if (i != strArray.length - 1) {
				// 如果不是数组的最后一个元素,在元素后面加顿号
				System.out.print(strArray[i] + "、");
			} else {
				// 数组的最后一个元素后面不加顿号
				System.out.println(strArray[i]);
			}
		}
	}
}


