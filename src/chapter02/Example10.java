package chapter02;
public class Example10{
	public static void main(String[] args) {
		int month = 5; //假设当前为5月份
		switch (month) {
		case 12:
		case 1:
		case 2:
			System.out.println("当前为时间为冬季");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("当前时间为春季");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("当前时间为夏季");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("当前时间为冬季");
			break;
		default:
			System.out.println("输入的月份不正确！！！");
			break;
		}
	}
}


