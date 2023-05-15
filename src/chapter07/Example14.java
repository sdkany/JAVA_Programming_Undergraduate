package chapter07;
import java.io.*;
import java.util.Arrays;
public class Example14 {
	public static void main(String[] args){
		// 创建File对象，并指定文件路径
		File file = new File("F:\\Java基础入门\\workspace\\chapter07");
		// 判断是否是目录
		if (file.isDirectory()) {
			// 使用Lambda表达式过滤目录中所有以.txt结尾的文件的名称
			String[] fileNames = file.list(
								(dir,name) -> name.endsWith(".txt"));
			// 对指定路径下的文件或目录进行遍历
			Arrays.stream(fileNames)
				  .forEach(f -> System.out.println(f));
		}
	}
}

