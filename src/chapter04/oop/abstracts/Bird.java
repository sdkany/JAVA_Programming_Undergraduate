package chapter04.oop.abstracts;

import chapter04.oop.interfaces.Flying;

public abstract class Bird extends Animal implements Flying {
    public Bird() {
    }

    public Bird(String name, int age) {
        super(name, age);
    }


}
