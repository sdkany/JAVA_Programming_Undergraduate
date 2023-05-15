package chapter07;
import java.io.*;
public class Example08 {
	public static void main(String[] args) throws Exception {
		// 创建字符输出流对象，并指定输出文件
		FileWriter fileWriter = new FileWriter("writer.txt");
		// 将定义的字符写入文件
		fileWriter.write("轻轻的我走了，\r\n");
		fileWriter.write("正如我轻轻的来；\r\n");
		fileWriter.write("我轻轻的招手，\r\n");
		fileWriter.write("作别西天的云彩。\r\n");
		// 关闭流
		fileWriter.close();
	}
}
