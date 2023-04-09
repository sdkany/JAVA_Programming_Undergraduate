package chapter02;
public class Example21 {
	public static void main(String[] args) {
		int[] arr = new int[3];   // 定义一个长度为3的数组
		arr[0] = 5;	              // 为数组的第一个元素赋值
		System.out.println("arr[0]=" + arr[0]);	 // 访问数组的元素
		arr = null;		          // 将变量arr置为null
		System.out.println("arr[0]=" + arr[0]);  // 再次访问数组的元素
	}
}

