package chapter07;
import java.io.*;
public class Example16 {
	public static void main(String[] args){
		// 创建File对象，并指定文件路径
		File files = new File("D:\\test\\新建文件夹");
         // 调用删除方法
		deleteDir(files);
	}
	//删除方法
	public static void deleteDir(File files) {
		// 获取File对象中的所有文件，并将其放在数组中
		File[] listFiles = files.listFiles();
		// 循环遍历数组
		for (File file : listFiles) {
			// 如果是目录文件，则递归调用删除方法
			if(file.isDirectory()){
				deleteDir(file);
			} 
			// 如果是文件，则直接删除
			file.delete();
		}
        // 删除文件夹内所有文件后，再删除文件夹
		files.delete();
	}
}

