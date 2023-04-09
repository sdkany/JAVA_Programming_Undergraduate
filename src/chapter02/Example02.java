package chapter02;
public class Example02 {
	public static void main(String[] args) {
		byte a;                // 定义byte类型的变量a
		int b = 298;           // 定义int类型的变量b，其表现形式是十六进制
		a = (byte) b;
		System.out.println("b=" + b);
		System.out.println("a=" + a);
	}
}

