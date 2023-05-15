package chapter07;
import java.io.*;
public class Example06 {
	public static void main(String[] args) throws Exception {
		// 创建用于输入和输出的字节缓冲流对象
		BufferedInputStream bis = new BufferedInputStream(
				new FileInputStream("source/src.jpg"));
		BufferedOutputStream bos = new BufferedOutputStream(
				new FileOutputStream("target/dest.jpg"));
		// 定义一个int类型的变量len
		int len = 0;
		// 获取拷贝文件前的系统时间
		long beginTime = System.currentTimeMillis();
		// 通过循环读取输入字节缓冲流中的数据，并通过输出字节缓冲流写入到新文件
		while ((bis.read()) != -1) {
			bos.write(len);
		}
		// 获取拷贝之后的系统时间
		long endTime = System.currentTimeMillis();
		// 输出拷贝花费时间
		System.out.println("花费时间为："+(endTime-beginTime) +"毫秒");
		// 关闭流
		bis.close();
		bos.close();
	}
}
