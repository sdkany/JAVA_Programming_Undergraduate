package chapter04.oop3.interfaces;

/**
 * @author SDKany
 * @ClassName Flying
 * @Date 2023/4/6 15:51
 * @Version V1.0
 * @Description Flying接口
 *      定义一个接口：Flying，描述可以飞行的东西
 *      接口之间允许多继承，例如接口A继承接口B和接口C
 *      接口可以包含：
 *      1. 抽象方法（需要在实现接口的类中实现）
 *      2. 静态方法（无需初始化即可调用）
 *      3. 默认方法（类方法，用于对现有接口的修改的同时，不影响已经实现了的类）
 *      4. 静态常量
 */
public interface Flying {
    // 定义一个静态常量
    public static final String description = "这是一个对Flying接口的描述，是常量";

    // 定义2个抽象类
    public abstract void takeOff();
    void land();

    // 定义一个默认方法
    default void keep() {
        System.out.println("默认方法：保持飞行！");
    }

    // 定义一个静态方法
    public static void crash(){
        System.out.println("静态方法：坠落！");
    }
}
