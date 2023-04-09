package chapter02;
public class Example25 {
	public static void main(String[] args) {
		int[][] arr = new int[3][];           // 定义一个长度为3的二维数组
		arr[0] = new int[] { 11, 12 };        // 为数组的元素赋值
		arr[1] = new int[] { 21, 22, 23 };
		arr[2] = new int[] { 31, 32, 33, 34 };
		int sum = 0;                          // 定义变量记录总销售额
		for (int i = 0; i < arr.length; i++) {// 遍历数组元素
			int groupSum = 0;                 // 定义变量记录小组销售总额
			for (int j = 0; j < arr[i].length; j++) { 
				groupSum += arr[i][j];
			}
			sum +=groupSum;				      // 累加小组销售额
			System.out.println("第" + (i + 1) + "小组销售额为：" 
                                     + groupSum + " 万元。");
		}
		System.out.println("总销售额为: " + sum + " 万元。");
	}
}

