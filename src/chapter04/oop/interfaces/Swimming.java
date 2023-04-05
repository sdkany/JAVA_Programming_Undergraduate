package chapter04.oop.interfaces;

public interface Swimming {
    public abstract void swim();

    public default void dive(){
        System.out.println("这个" + this.getClass().getSimpleName() + "开始潜水了！");
    }
}
