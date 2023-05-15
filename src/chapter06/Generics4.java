package chapter06;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author SDKany
 * @ClassName Generics4
 * @Date 2023/5/8 11:02
 * @Version V1.0
 * @Description 泛型示例4
 */
public class Generics4 {
    public static void main(String[] args) {
        ArrayList<Double> arrayList2 = new ArrayList<>();
        arrayList2.add(0.1);
        arrayList2.add(0.2);
        for (Double d : arrayList2){
            System.out.println(d);
        }
    }
}
