package chapter06;
import java.util.Arrays;
public class Example28 {
	public static void main(String[] args) {
		int[] arr = { 9, 8, 3, 5, 2 };
		Arrays.sort(arr);							// 调用排序方法，对数组排序
		int index = Arrays.binarySearch(arr, 3);	// 查找指定元素3
		System.out.println("元素3的索引是:" + index);	// 输出打印元素所在的索引位置
	}
}

