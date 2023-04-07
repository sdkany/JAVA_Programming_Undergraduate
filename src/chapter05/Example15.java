package chapter05;
public class Example15 {
	public static void main(String[] args) {
        System.out.println("计算绝对值的结果: " + Math.abs(-1));
		System.out.println("计算正弦的结果: " + Math.sin(1.57));
		System.out.println("计算余弦的结果: " + Math.cos(2.0));
		System.out.println("计算正切的结果: " + Math.tan(0.8));
		System.out.println("计算平方根的结果: " + Math.sqrt(4));
		System.out.println("计算立方根的结果: " + Math.cbrt(9));
		System.out.println("计算乘方的结果: " + Math.pow(2,2));
		System.out.println("求大于参数的最小整数: " + Math.ceil(4.6));
		System.out.println("求小于参数的最大整数: " + Math.floor(-5.2));
		System.out.println("对小数进行四舍五入后的结果: " + Math.round(-8.6));
		System.out.println("求两个数的较大值: " + Math.max(5.1, 5.5));
		System.out.println("求两个数的较小值: " + Math.min(5.1, 5.5));
		System.out.println("生成一个大于等于0小于1的随机值: "
											+ Math.random());
	}
}

