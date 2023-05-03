package chapter05;
import java.text.*;
import java.util.Random;

public class Example27 {
	public static void main(String[] args) throws ParseException{
	    // 创建一个SimpleDateFormat对象，并指定日期格式
 		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
 		// 定义一个日期格式的字符串
 		String str = "2018/01/27";
 		// 将字符串解析成Date对象
 		//System.out.println(sdf.parse(str));

		Random random = new Random();
		int a = random.nextInt(90000000) + 10000000;
		System.out.println(a);

	}
}

