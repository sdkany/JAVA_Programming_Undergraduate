package chapter02;
public class Example09 {
	public static void main(String[] args) {
		int grade = 75; // 定义学生成绩
		if (grade > 80) {
			// 满足条件 grade > 80
			System.out.println("该成绩的等级为优");
		} else if (grade > 70) {
			// 不满足条件 grade > 80 ，但满足条件 grade > 70 
			System.out.println("该成绩的等级为良");
		} else if (grade > 60) {
			// 不满足条件 grade > 70 ，但满足条件 grade > 60 
			System.out.println("该成绩的等级为中");
		} else {
			// 不满足条件 grade > 60 
			System.out.println("该成绩的等级为差");
		}
	}
}

