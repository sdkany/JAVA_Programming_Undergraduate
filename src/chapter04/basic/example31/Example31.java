package chapter04.basic.example31;
import java.io.IOException;
public class Example31 {
    // 下面的方法实现了两个数组相应位置相除，并使用throws关键字抛出异常
	public static void divide(int[] x, int[] y){
		System.out.println("开始执行除法运算");
		int result = 0;
		for(int i = 0; i < x.length; i++) {
			try {
				result = x[i] / y[i];  // 定义变量result记录两个数组相应位置相除的结果
			} catch (ArithmeticException e1) {
				System.out.println("第" + i + "轮除法函数计算过程中出现异常！" + e1.getMessage());
			} catch (IndexOutOfBoundsException e2) {
				System.out.println("第" + i + "轮数组访问过程中出现异常！" + e2.getMessage());
			}finally {
				System.out.println("第" + i + "轮计算结束：" + result);  // 将结果返回
			}
			
		}
	}
	public static void main(String[] args) {
		divide(new int[]{1,2,3,4}, new int[]{0,1,2});   // 调用divide()方法
	}
}


