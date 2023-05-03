package chapter04.basic.example35;

import java.io.*;

public class Example36 {
	// 下面的方法实现了两个整数相除，
     public static int divide(int x,int y) throws DivideByMinusException, IllegalArgumentException {
		if (y == 0) {
			// 使用throw关键字声明异常对象
			throw new DivideByMinusException("除数是0");
		}
		 if (y < 0) {
			 // 使用throw关键字声明异常对象
			 throw new IllegalArgumentException("除数是负数");
		 }
		int result = x / y; // 定义一个变量result记录两个数相除的结果
		return result;      // 将结果返回
	}
	public static void main(String[] args) {
		try {
			int result = divide(4, -1);
			System.out.println(result);
		} catch (DivideByMinusException e) {
			System.out.println("捕获的异常信息为：" + e.getMessage());
		} catch (IllegalArgumentException e){
			System.out.println("捕获的异常信息为：" + e.getMessage());
		} finally {

		}

		File file = new File("C:\\Users\\SDKany\\Desktop\\x.tt");
		String result;
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(file));
			while((result = reader.readLine()) != null) {
				System.out.println(result);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}


	}
}

