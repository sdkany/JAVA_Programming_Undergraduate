package chapter07;
import java.io.*;
public class Example11 {
	public static void main(String[] args) throws Exception {
        // 1、创建字节输入流对象，获取源文件
		FileInputStream in = new FileInputStream("reader.txt");
		// 将字节输入流对象转换成字符输入流对象
		InputStreamReader isr = new InputStreamReader(in);
		// 创建字符输入缓冲流对象
		BufferedReader br = new BufferedReader(isr); 
		// 2、创建字节输出流对象，指定目标文件
		FileOutputStream out = new FileOutputStream("writer.txt");
		// 将字节输出流对象转换成字符输出流对象
		OutputStreamWriter osw = new OutputStreamWriter(out);
		// 创建字符输出缓冲流对象
		BufferedWriter bw = new BufferedWriter(osw); 
		// 定义一个字符串变量
		String line = null;
		// 通过循环判断是否读到文件末尾
		while ((line = br.readLine()) != null) {
			// 输出读取到的文件
			bw.write(line); 
			bw.newLine();
		}
		// 关闭流
		br.close();
		bw.close();
	}
}
