package chapter02;
public class Example23 {
	public static void main(String[] args) {
		// 1、定义一个int[]数组
		int[] arr = { 4, 1, 6, 3, 9, 8 }; 
		// 2、定义变量max用于记住最大数，首先假设第一个元素为最大值
		int max = arr[0]; 
		// 3、遍历数组，查找最大值
		for (int i = 1; i < arr.length; i++) {
			// 比较 arr[i]的值是否大于max
			if (arr[i] > max) { 
				// 条件成立，将arr[i]的值赋给max
				max = arr[i];   
			}
		}
		System.out.println("数组arr中的最大值为：" + max); // 打印最大值
	}
}

