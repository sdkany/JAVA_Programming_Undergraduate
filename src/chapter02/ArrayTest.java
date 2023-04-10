package chapter02;

import java.util.Random;

import java.util.Random;

public class ArrayTest {

	public static void main(String[] args) {
		//String[] a = new String[10];
		//a = new String[]{"张三", "李四", "王五", "赵六", "刘备", "关羽", "张飞", "赵云"};
		//a[0] = "zhangsan";


		String[] name = {"张三", "李四", "王五", "赵六", "刘备", "关羽", "张飞", "赵云"};
		String[] location = {"长坂坡", "南极洲", "家", "月球", "火星", "北半球", "亚洲", "欧洲"};
		String[] action = {"吃火锅", "过五关斩六将", "单挑五千曹军", "救阿斗", "备考四六级", "睡觉", "写代码", "找Bug"};
		for (int i = 0; i < 10; i++) {
			int x = new Random().nextInt(name.length);
			int y = new Random().nextInt(location.length);
			int z = new Random().nextInt(action.length);

			System.out.println(name[x] + "在" + location[y] + action[z]);
		}
//		
		for (int i = 0; i < action.length; i++) {
			String string = action[i];
			System.out.println(string);
		}
	}

}
