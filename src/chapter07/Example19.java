package chapter07;
import java.io.*;
import java.nio.channels.*;
public class Example19 {
	public static void main(String[] args) throws Exception {
		// 创建RandomAccessFile对象，指定源文件
		RandomAccessFile infile = 
						new RandomAccessFile("source/src.jpg","rw");
		// 获取读取源文件FileChannel通道
		FileChannel inChannel = infile.getChannel();
		// 创建RandomAccessFile对象，指定目标文件
		RandomAccessFile outfile = 
						new RandomAccessFile("target/dest.jpg","rw");
		// 获取复制目标文件FileChannel通道
		FileChannel outChannel = outfile.getChannel();
		// 使用transferTo()方法进行整体复制
		long transferTo = inChannel.transferTo(0, inChannel.size(),
												outChannel);
		if(transferTo>0){
			System.out.println("复制成功!");
		}
		// 关闭资源
		infile.close();
		inChannel.close();
		outfile.close();
		outChannel.close();
	}
}

