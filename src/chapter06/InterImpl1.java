package chapter06;

/**
 * @author SDKany
 * @ClassName InterImpl1
 * @Date 2023/5/8 13:03
 * @Version V1.0
 * @Description
 */
public class InterImpl1<T> implements Inter<T>{
    private T t;
    @Override
    public void setVar(T t) {
        this.t = t;
    }
    @Override
    public T getVar() {
        return t;
    }
    public static void main(String[] args) {
        InterImpl1 impl1 = new InterImpl1();
        impl1.setVar("String");
        System.out.println("这个对象里面的类型是String么？" +
                (impl1.getVar() instanceof String));
    }
}
