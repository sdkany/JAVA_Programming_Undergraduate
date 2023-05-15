package chapter07;
import java.io.*;
public class Example15 {
	public static void main(String[] args){
		// 创建File对象，并指定文件路径
		File file = new File("F:\\Java基础入门\\workspace\\chapter07");
		// 调用fileDir()方法,遍历目录
		fileDir(file);
	}
    // 遍历目录及其子目录
	public static void fileDir(File file) {
		// 获得目录下所有文件,并赋给数组
		File[] listFiles = file.listFiles();
		// 循环遍历数组
		for (File files : listFiles) {
			// 如果遍历的是目录，则递归调用fileDir()方法
			if(files.isDirectory()){
				fileDir(files);
			}
			// 输出文件路径
			System.out.println(files);
		}
	}
}
