package chapter02;

import java.util.Random;

/**
 *
 * @author SDKany
 * @since 2023年3月16日
 */
public class Branch {

	public static void main(String[] args) {
		Random random = new Random(); // 初始化随机对象

		int count = 5;
		while (count-- > 0) {
			int score = random.nextInt(101); // 随机一个[0,101)之间的整数

			System.out.println("使用if...else...进行分支结构的判断");

			if (score >= 90) {
				System.out.println("该同学的分数为" + score + ", 成绩为优秀！");
			} else if (score >= 80) {
				System.out.println("该同学的分数为" + score + ", 成绩为良好！");
			} else if (score >= 70) {
				System.out.println("该同学的分数为" + score + ", 成绩为一般！");
			} else if (score >= 60) {
				System.out.println("该同学的分数为" + score + ", 成绩为及格！");
			} else {
				System.out.println("该同学的分数为" + score + ", 成绩为不及格！");
			}

			System.out.println("使用switch进行分支结构的判断");

			switch (score / 10) { // switch case只能判断值，不能输入比较，因此将分数除10，得到十位的值，再进行判断
				case 10: {}
				case 9: {
					System.out.println("该同学的分数为" + score + ", 成绩为优秀！");
					break;
				}
				case 8: {
					System.out.println("该同学的分数为" + score + ", 成绩为良好！");
					break;
				}
				case 7: {
					System.out.println("该同学的分数为" + score + ", 成绩为一般！");
					break;
				}
				case 6: {
					System.out.println("该同学的分数为" + score + ", 成绩为及格！");
					break;
				}
				default:
					System.out.println("该同学的分数为" + score + ", 成绩为不及格！");
					break;
			}
		}
	}

}
