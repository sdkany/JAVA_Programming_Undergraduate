package chapter02;
public class Example16 {
	public static void main(String[] args) {
		// 外层循环,变量i控制输出1~9行
		outer: for (int i = 1; i <= 9; i++) {
			// 内层循环，变量j控制输出1~9列
			for (int j = 1; j <= i; j++) {
				if (i >= 3) {
					break outer; // 当循环打印第3行时，直接跳出outer外层循环
				}
				// 使用字符串拼接的形式，打印每个内层循环的执行语句
				System.out.print(j + "*" + i + "=" + j * i + "\t");
			}
			// 使用println()方法控制外层循环进行换行
			System.out.println("");
		}
	}
}
