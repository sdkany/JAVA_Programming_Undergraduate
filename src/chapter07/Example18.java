package chapter07;
import java.nio.CharBuffer;
public class Example18 {
	public static void main(String[] args){
         // 创建CharBuffer对象，并指定缓冲区容量大小为6
		CharBuffer charBuffer = CharBuffer.allocate(6);
		System.out.println("容量：" + charBuffer.capacity());
		System.out.println("界限值：" + charBuffer.limit());
		System.out.println("初始位置：" + charBuffer.position());
		// 向CharBuffer对象中放入3个元素
		charBuffer.put('x');
		charBuffer.put('y');
		charBuffer.put('z');
         System.out.println("加入元素后的界限值：" + charBuffer.limit());
		System.out.println("加入元素后的位置：" + charBuffer.position());
		// 执行flip()方法
		charBuffer.flip();
		System.out.println("执行flip()后的界限值：" + charBuffer.limit());
		System.out.println("执行flip()后的位置：" + charBuffer.position());
		// 取出第1个元素
		System.out.println("取出的第1个元素为：" + charBuffer.get());
		System.out.println("取出后的界限值：" + charBuffer.limit());
		System.out.println("取出后的位置：" + charBuffer.position());
		// 执行clear()方法
		charBuffer.clear();
		System.out.println("执行clear()后的界限值：" + charBuffer.limit());
		System.out.println("执行clear()后的位置：" + charBuffer.position());
		// 取出第1个元素
		System.out.println("取出的第1个元素为：" + charBuffer.get(0));
		System.out.println("取出后的界限值：" + charBuffer.limit());
		System.out.println("取出后的位置：" + charBuffer.position());	
	}
}


