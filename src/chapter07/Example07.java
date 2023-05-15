package chapter07;
import java.io.*;
public class Example07 {
	public static void main(String[] args) throws Exception {
         // 创建FileReader对象，并指定需要读取的文件
		FileReader fileReader = new FileReader("reader.txt");
		// 定义一个int类型的变量len，其初始化值为0
		int len = 0;
		// 通过循环来判断是否读取到了文件末尾
		while ((len = fileReader.read()) != -1) {
			// 输出读取到的字符
			System.out.print((char)len);
		}
		// 关闭流
		fileReader.close();
	}
}
