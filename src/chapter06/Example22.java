package chapter06;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;
public class Example22 {
   public static void main(String[] args) throws Exception {
	   String filePath = "test.properties";
	    // 1、通过Properties进行属性文件读取操作
		Properties pps = new Properties();
		// 加载要读取的文件test.properties
		pps.load(new FileInputStream(filePath));
		// 遍历test.properties键值对元素信息
	   Enumeration names = pps.propertyNames();
	   while(names.hasMoreElements()){
		   String key = (String)names.nextElement();
		   System.out.println(key + "=" + pps.getProperty(key));
	   }
		// 2、通过Properties进行属性文件写入操作
		// 指定要写入操作的文件名称和位置
		FileOutputStream out = new FileOutputStream(filePath);
		// 向Properties类文件进行写入键值对信息
		pps.setProperty("Font-color", "black");
		// 将此 Properties集合中新增键值对信息写入配置文件
		pps.store(out, "新增字体大小");
	}
	public static void newFile(String filePath){
	   File file = new File(filePath);
	   try{
		   file.createNewFile();
	   } catch (IOException e){
		   e.printStackTrace();
	   }
	}
}
