package chapter06;

import java.util.ArrayList;

/**
 * @author SDKany
 * @ClassName Generics5
 * @Date 2023/5/8 11:02
 * @Version V1.0
 * @Description 泛型示例5
 */
public class Generics5 {
    public static <T> T show (T t){
        System.out.println(t);
        return t;
    }
    public static void main(String[] args) {
        show(new Integer(123));
        show(new Double(0.11));
        show("Me");
    }
}
