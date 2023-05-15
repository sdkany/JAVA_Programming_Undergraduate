package chapter06;

import java.util.HashMap;

/**
 * @author SDKany
 * @ClassName Generics3
 * @Date 2023/5/8 11:02
 * @Version V1.0
 * @Description 泛型示例3
 */
public class Generics3 {
    public static void main(String[] args) {
        Box3<HashMap> box = new Box3(new HashMap<>());
        box.getValue().put("Color", "Red");
        System.out.println(box);
        //System.out.println(box.getValue() instanceof Integer);
    }
}
class Box3<T>{
    private T value;
    public Box3(T value) {
        this.value = value;
    }
    public T getValue() {
        return value;
    }
    public void setValue(T value) {
        this.value = value;
    }
    @Override
    public String toString() {
        return "Box{value='" + value + "\'}";
    }
}
