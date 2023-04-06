package chapter04.oop3.classes;

import chapter04.oop3.abstracts.Bird;
import chapter04.oop3.interfaces.Running;

/**
 * @author SDKany
 * @ClassName Eagle
 * @Date 2023/4/6 15:51
 * @Version V1.0
 * @Description Eagle类，老鹰是一种鸟类，并且可以在陆地上跑一跑跳一跳
 */
public class Eagle extends Bird implements Running {

    public Eagle() {
    }

    public Eagle(String name, int age) {
        super(name, age);
    }

    @Override
    public void shout() {
        System.out.println("Eagle在啁啁啁的叫");
    }

    @Override
    public void takeOff() {

    }

    @Override
    public void land() {

    }

    @Override
    public void accelerate() {

    }

    @Override
    public void decelerate() {

    }

}
