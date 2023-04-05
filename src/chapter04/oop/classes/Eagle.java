package chapter04.oop.classes;

import chapter04.oop.abstracts.Bird;
import chapter04.oop.interfaces.Running;

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
