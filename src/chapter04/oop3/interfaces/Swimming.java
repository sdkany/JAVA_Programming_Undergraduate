package chapter04.oop3.interfaces;

/**
 * @author SDKany
 * @ClassName Swimming
 * @Date 2023/4/6 15:51
 * @Version V1.0
 * @Description Swimming接口，游泳的接口
 */
public interface Swimming {
    public abstract void swim();

    public default void dive(){
        System.out.println("这个" + this.getClass().getSimpleName() + "开始潜水了！");
    }
}
