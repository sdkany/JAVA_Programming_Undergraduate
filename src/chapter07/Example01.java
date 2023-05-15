package chapter07;
import java.io.*;
public class Example01 {
	public static void main(String[] args) throws Exception {
//		// 创建一个文件字节输入流来读取文件
//		FileInputStream in = new FileInputStream("test1.txt");
//		// 定义一个int类型的变量b
//		int b = 0;
//		// 通过循环来读取文件，当返回值为-1结束循环
//		while((b=in.read()) != -1){
//			System.out.println(b);
//		}
//		// 关闭流
//		in.close();

		FileInputStream in = new FileInputStream("reader.txt");
		InputStreamReader isr = new InputStreamReader(in);
		BufferedReader br = new BufferedReader(isr);
		FileOutputStream out = new FileOutputStream("writer.txt");
		OutputStreamWriter osw = new OutputStreamWriter(out);
		BufferedWriter bw = new BufferedWriter(osw);
		String line = null;
		while ((line = br.readLine()) != null) {
			bw.write(line);
			bw.newLine();
		}
		br.close();
		bw.close();
		in.close();
		isr.close();
		out.close();
		osw.close();
	}
}

