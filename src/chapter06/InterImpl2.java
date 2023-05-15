package chapter06;

/**
 * @author SDKany
 * @ClassName InterImpl2
 * @Date 2023/5/8 13:08
 * @Version V1.0
 * @Description
 */
public class InterImpl2 implements Inter<Integer>{
    private Integer integer;
    @Override
    public void setVar(Integer integer) {
        this.integer = integer;
    }
    @Override
    public Integer getVar() {
        return integer;
    }
    public static void main(String[] args) {
        Inter<Integer> inter = new InterImpl2();
        inter.setVar(new Integer(123));
        System.out.println(inter.getVar());
    }
}
