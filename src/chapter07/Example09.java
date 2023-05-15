package chapter07;
import java.io.*;
public class Example09 {
	public static void main(String[] args) throws Exception {
        // 创建FileReader对象，并指定需要读取的文件
		FileReader fileReader = new FileReader("reader.txt");
		// 创建FileWriter对象，并指定写入数据的目标文件
		FileWriter fileWriter = new FileWriter("writer.txt");
		// 定义一个int类型的变量len，其初始化值为0
		int len = 0;
		// 定义一个长度为1024的字符数组
		char[] buff = new char[1024];
		// 通过循环来判断是否读取到了文件末尾
		while ((len = fileReader.read(buff)) != -1) {
			// 输出读取到的字符
			fileWriter.write(buff, 0, len);
		}
		// 关闭流
		fileReader.close();
		fileWriter.close();
	}
}


