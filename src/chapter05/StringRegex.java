package chapter05;

/**
 * @author SDKany
 * @ClassName StringRegex
 * @Date 2023/5/4 20:05
 * @Version V1.0
 * @Description
 */
public class StringRegex {
    public static void main(String[] args) {
        String regex = "\\d+";
        String input = "大家好，我今年18岁了，我在计算机7/8班学java课。";
        String[] strs = input.split(regex);
        System.out.println("字符串拆分之后为：");
        for (String s : strs){
            System.out.println(s);
        }

        System.out.println("是否匹配？" + "123456ajhd".matches(regex));
        System.out.println("是否匹配？" + "123456".matches(regex));

        System.out.println("替换后为："
                + "2023-05-04".replaceAll("\\d", "*"));
        System.out.println("替换后为："
                + "2023-05-04".replaceAll("-", "%"));
        System.out.println("替换后为："
                + "2023-05-04".replaceAll("-", "\\\\"));
    }
}
