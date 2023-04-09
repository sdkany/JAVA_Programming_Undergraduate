package chapter02;
public class Example06 {
	public static void main(String[] args) {
		int x = 0; // 定义变量x，初始值为0
		int y = 0; // 定义变量y，初始值为0
		int z = 0; // 定义变量z，初始值为0
		boolean a, b; // 定义boolean变量a和b
		a = x > 0 & y++ > 1;  // 逻辑运算符&对表达式进行运算，然后将结果赋值给a
		System.out.println("a = " + a);
		System.out.println("y = " + y);
		b = x > 0 && z++ > 1; // 逻辑运算符&&对表达式进行运算，然后将结果赋值给b
		System.out.println("b = " + b);
		System.out.println("z = " + z);
	}
}


