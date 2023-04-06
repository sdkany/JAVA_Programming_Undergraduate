package chapter04.oop3.interfaces;

/**
 * @author SDKany
 * @ClassName Foraging
 * @Date 2023/4/6 15:51
 * @Version V1.0
 * @Description Foraging接口，觅食的接口
 */
public interface Foraging {
    abstract void seekFood();
    public default void full(){
        System.out.println("这个" + this.getClass().getSimpleName() + "吃饱了！");
    }
}
