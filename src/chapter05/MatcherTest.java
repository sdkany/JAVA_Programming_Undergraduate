package chapter05;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author SDKany
 * @ClassName MatcherTest
 * @Date 2023/5/4 19:37
 * @Version V1.0
 * @Description
 */
public class MatcherTest {
    public static void main(String[] args) {
        System.out.println("是否匹配："
                + Pattern.matches("\\d+", "2023-05-04"));
        System.out.println("是否匹配："
                + Pattern.matches("\\d+", "123456"));
        String regex = "\\d+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher("Date:2023-05-04");
        System.out.println("该Matcher由哪个Pattern创建的？" + matcher.pattern());
        System.out.println("find()是否匹配？" + matcher.find());
        System.out.println("匹配到的字串：" + matcher.group());
        System.out.println("匹配开始位置：" + matcher.start());
        System.out.println("匹配结束位置：" + matcher.end());
        System.out.println("lookingAt是否匹配？" + matcher.lookingAt());
        try{
            System.out.println("匹配开始位置：" + matcher.start());
            System.out.println("匹配结束位置：" + matcher.end());
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
