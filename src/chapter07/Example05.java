package chapter07;
import java.io.*;
public class Example05 {
	public static void main(String[] args) throws Exception {
		// 创建文件输入流对象读取指定目录下的文件
		FileInputStream in = new FileInputStream("source/src.jpg");
		// 创建文件输出流对象将读取到的文件内容写入到指定目录的文件中
		FileOutputStream out = new FileOutputStream("target/dest.jpg");
		// 定义一个int类型的变量len
		int len = 0;
		// 定义一个长度为1024的字节数组
		byte[] buff = new byte[1024];
		// 获取拷贝文件前的系统时间
		long beginTime = System.currentTimeMillis();
		// 通过循环将读取到的文件字节信息写入到新文件
		while ((len = in.read(buff)) != -1) {
			// 每循环读取一次字节数组，就将所读取到的内容写入到文件
			out.write(buff,0,len);
		}
		// 获取拷贝之后的系统时间
		long endTime = System.currentTimeMillis();
		// 输出拷贝花费时间
		System.out.println("花费时间为："+(endTime-beginTime) +"毫秒");
		// 关闭流
		in.close();
		out.close();
	}
}


