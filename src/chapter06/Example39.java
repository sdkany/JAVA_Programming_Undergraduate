package chapter06;

import java.util.ArrayList;
import java.util.List;

/**
 * @author SDKany
 * @ClassName Example39
 * @Date 2023/5/8 13:21
 * @Version V1.0
 * @Description
 */
public class Example39 {
    public static void test(List<?> list){
        for (int i = 0; i < list.size(); i ++){
            System.out.println(list.get(i));
        }
    }
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("123");
        list.add("456");
        test(list);
    }
}
