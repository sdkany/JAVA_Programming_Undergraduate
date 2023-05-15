package chapter07;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Arrays;
public class Example13 {
	public static void main(String[] args) {
		// 创建File对象，并指定文件路径
		File file = new File("C:\\JAVA_Programming_Undergraduate\\src");
		// 判断是否是目录
		if (file.isDirectory()) {
			// 获取目录中的所有文件的名称
			String[] fileNames = file.list();
			// 对指定路径下的文件或目录进行遍历
			Arrays.asList(fileNames).forEach(s -> System.out.println(s));
		}
		System.out.println("=============");
		if (file.isDirectory()) {
			// 使用过滤器获取目录中满足条件的文件名称
			String[] fileNames = file.list(new FilenameFilter() {
				@Override
				public boolean accept(File dir, String name) {
					if (name.endsWith(".java"))
						return true;
					return false;
				}
			});
			// 对指定路径下的文件或目录进行遍历
			Arrays.asList(fileNames).forEach(s -> System.out.println(s));
		}
	}
}
