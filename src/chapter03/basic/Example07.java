package chapter03.basic;
public class Example07 {
	// 使用递归实现 求1~n的和
	public static int getSum(int n) {
		if (n == 1) {
			// 满足条件，递归结束
			return 1;
		}
		int temp = getSum(n - 1);
		return temp + n;
	}
	public static void main(String[] args) {
		int sum = getSum(4);                // 调用递归方法，获得1~4的和
		System.out.println("sum = " + sum); // 打印结果
	}
}


