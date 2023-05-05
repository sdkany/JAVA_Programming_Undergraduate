package chapter05;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author SDKany
 * @ClassName PatternTest
 * @Date 2023/5/3 19:53
 * @Version V1.0
 * @Description
 */
public class PatternTest {
    public static void main(String[] args) {
        test1();
        test2();
    }

    public static void test1(){
        String regex = "-";
        String content = "2023-05-04";
        Pattern pattern = Pattern.compile(regex);
        String[] strs = pattern.split(content);
        System.out.println("拆分后的strs长度为：" + strs.length);
        for (String s: strs) {
            System.out.println(s);
        }
    }
    public static void test2(){
        String regex = "\\d+";
        String content =
                "我的Q号是：123456，我的手机号是：15521001234，我的教师卡号是：2022000。";
        Pattern pattern = Pattern.compile(regex);
        String[] strs = pattern.split(content);
        System.out.println("拆分后的strs长度为：" + strs.length);
        for (String s: strs) {
            System.out.println(s);
        }
    }

}
