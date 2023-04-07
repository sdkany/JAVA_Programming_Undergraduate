package chapter04.basic.example29;
public class Example29 {
    // 下面的方法实现了两个整数相除
	public static int divide(int x, int y) { 
		try {
			int result = x / y;      // 定义一个变量result记录两个数相除的结果
			return result;           // 将结果返回
		} catch (Exception e) {      // 对异常进行捕获处理
			System.out.println("捕获的异常信息为：" + e.getMessage());
		}
		// 定义当程序发生异常直接返回-1
		return -1;
	}
	public static void main(String[] args) {
        int result = divide(4, 0);    // 调用divide()方法
		if(result == -1){             // 对调用方法返回结果进行判断
			System.out.println("程序发生异常！"); 
		}else{
			System.out.println(result); 
		}
	}
}

