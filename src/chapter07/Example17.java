package chapter07;
import java.io.*;
public class Example17 {
	public static void main(String[] args) throws Exception{
        // 创建RandomAccessFile对象，并以只读模式打开time.txt文件
		RandomAccessFile raf = new RandomAccessFile("time.txt", "rw");
		// 读取还可以使用次数，第一次读取时times为5
		int times = Integer.parseInt(raf.readLine())-1;
		// 判断剩余次数
		if(times > 0){
			// 每执行一次代表使用一次，次数就减少一次
			System.out.println("您还可以试用"+ times+"次！");
			// 将记录指针重新指向文件开头
			raf.seek(0);
			// 将剩余次数再次写入文件
			raf.write((times+"").getBytes());
		}else{
			System.out.println("试用次数已经用完！");
		}
		// 关闭这个随机存取文件流并释放任何系统
		raf.close();
	}
}
