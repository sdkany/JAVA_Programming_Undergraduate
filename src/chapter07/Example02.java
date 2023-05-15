package chapter07;
import java.io.*;
public class Example02 {
	public static void main(String[] args) throws Exception {
		// 创建文件输出流对象，并指定输出文件名称
		FileOutputStream out = new FileOutputStream("out.txt", true);
		// 定义一个字符串
		String str = "hello world";
		// 将字符串转换为字节数组进行写入操作
		out.write(str.getBytes());
		// 关闭流
	    out.close();
	}
}

