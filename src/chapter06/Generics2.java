package chapter06;

/**
 * @author SDKany
 * @ClassName Generics2
 * @Date 2023/5/8 11:02
 * @Version V1.0
 * @Description 泛型示例2
 */
public class Generics2 {
    public static void main(String[] args) {
        Box2 box = new Box2(new Integer("123"));
        System.out.println(box.getValue() instanceof Integer);
        box.setValue("abc");
        System.out.println(box.getValue() instanceof Integer);
    }
}
class Box2{
    private Object value;
    public Box2(Object value) {
        this.value = value;
    }
    public Object getValue() {
        return value;
    }
    public void setValue(Object value) {
        this.value = value;
    }
    @Override
    public String toString() {
        return "Box{value='" + value + "\'}";
    }
}
