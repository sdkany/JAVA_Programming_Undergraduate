package chapter02;
public class Example12 {
	public static void main(String[] args) {
		int x = 1;          // 定义变量x，初始值为1
		do {
			System.out.println("x = " + x); // 打印x的值
			x++;           // 控制变量x，进行自增
		} while (x <= 4);  // 判断循环条件是否成立
	}
}
