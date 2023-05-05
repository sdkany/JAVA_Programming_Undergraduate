package chapter05;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author SDKany
 * @ClassName MatcherTest2
 * @Date 2023/5/4 19:37
 * @Version V1.0
 * @Description
 */
public class MatcherTest2 {
    public static void main(String[] args) {
        String regex = "\\bc.t\\b";
        String input = "cat cut cattie cat cabt";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(input); // 获取 matcher 对象
        int count = 0;
        while(m.find()) {
            count++;
            System.out.println("找到第" + count + "个匹配");
            System.out.println("匹配内容为：" + m.group());
            System.out.println("start(): "+m.start());
            System.out.println("end(): "+m.end());
        }
    }
}
