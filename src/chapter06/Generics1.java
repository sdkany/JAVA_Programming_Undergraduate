package chapter06;

/**
 * @author SDKany
 * @ClassName Generics1
 * @Date 2023/5/8 11:02
 * @Version V1.0
 * @Description 泛型示例1
 */
public class Generics1 {
    public static void main(String[] args) {
        Box box = new Box("data");
        System.out.println(box);
    }
}
class Box{
    private String value;
    public Box(String value) {
        this.value = value;
    }
    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }
    @Override
    public String toString() {
        return "Box{value='" + value + "\'}";
    }
}
