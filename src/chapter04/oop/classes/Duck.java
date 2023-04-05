package chapter04.oop.classes;

import chapter04.oop.abstracts.Animal;
import chapter04.oop.abstracts.SwimmingBird;
import chapter04.oop.interfaces.Flying;
import chapter04.oop.interfaces.Foraging;
import chapter04.oop.interfaces.Swimming;

public class Duck extends SwimmingBird implements Foraging {
    public Duck() {
    }

    public Duck(String name, int age) {
        super(name, age);
    }

    @Override
    public void shout() {
        System.out.println("Duck在嘎嘎嘎的叫");
    }

    @Override
    public void takeOff() {
        System.out.println("Duck以飞行姿态准备起飞：嘎嘎嘎");
    }

    @Override
    public void land() {
        System.out.println("Duck以飞行姿态准备降落：嘎嘎嘎");
    }

    @Override
    public void keep() {
        System.out.println("Duck以飞行姿态保持不动：嘎嘎嘎");
    }

    @Override
    public void accelerate() {
        System.out.println("Duck以奔跑姿态加速奔跑：嘎嘎嘎");
    }

    @Override
    public void decelerate() {
        System.out.println("Duck以奔跑姿态降低速度：嘎嘎嘎");
    }

    @Override
    public void swim() {
        System.out.println("Duck以游泳姿态降低速度：嘎嘎嘎");
    }

    @Override
    public void seekFood() {
        System.out.println("Duck开始找吃的了：嘎嘎嘎");
    }

 //   @Override
//    public void change(int pose1, int pose2){
//        super.change(pose1,pose2);
//    }

    @Override
    public String toString() {
        return "这个" + this.getClass().getSimpleName() + "的信息为：name = " + this.getName() + ", age = " + this.getAge();
    }

    public static void main(String[] args){
        Animal duck = new Duck("唐老鸭", 18);
        System.out.println(duck);

        Animal eagle = new Eagle("老鹰", 13);
        System.out.println(eagle);

        duck.shout();

        eagle.shout();

        ((SwimmingBird)duck).change(1,2);
        ((Foraging) duck).seekFood();
        ((Foraging) duck).full();
        ((Flying) duck).land();
    }
}
