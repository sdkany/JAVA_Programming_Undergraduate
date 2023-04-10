package chapter02;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 
 * @author SDKany
 * @since 2023��3��16��
 */

import java.util.Random;

/**
 *
 * @author SDKany
 * @since 2023年3月16日
 */

public class Loop {

	public static void main(String[] args) throws InterruptedException {
		doWhile();
		//For();
		//While();
	}

	public static void doWhile() { // 使用do while循环计算平方根
		double number = 666; // 设置正整数
		double precision = 0.00001; // 设置平方根计算精度
		double sqrt = 1.0; // 预设平方根结果为1.0
		double cheak; // 差值变量
		do {
			sqrt = (number / sqrt + sqrt) / 2.0;
			cheak = sqrt * sqrt - number;
		} while ((cheak >= 0 ? cheak : -cheak) > precision);
		System.out.println(number + "的平方根为" + sqrt + "，它的平方数为" + sqrt * sqrt);
	}

	public static void For() { // 使用for循环计算阶乘
		int number = 10; // 设置正整数
		int factorial = 1; // 设置阶乘factorial为1

		for (int i = 1; i <= number; i = i + 2) { // 从1循环累乘到10得到阶乘
			factorial *= i;
		}

		System.out.println(number + "! = " + factorial);
	}

	public static void While() throws InterruptedException {

		Random random = new Random();

		while (true) {

			int x = random.nextInt(10); // 随机产生[0,10)的整数

			if (x % 2 == 1) {
				System.out.println("产生了奇数" + x + "，跳过本次循环！");
				continue;
			}

			System.out.println("====> 当前产生的数字为：" + x);

			if (x == 0) {
				System.out.println("产生了一个0，终止循环！");
				break;
			}

			Thread.sleep(3000);

		}
	}

}
