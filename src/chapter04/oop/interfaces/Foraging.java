package chapter04.oop.interfaces;

public interface Foraging {
    abstract void seekFood();
    public default void full(){
        System.out.println("这个" + this.getClass().getSimpleName() + "吃饱了！");
    }
}
