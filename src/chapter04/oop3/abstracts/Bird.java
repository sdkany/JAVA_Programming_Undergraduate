package chapter04.oop3.abstracts;

import chapter04.oop3.interfaces.Flying;

/**
 * @author SDKany
 * @ClassName Bird
 * @Date 2023/4/6 15:51
 * @Version V1.0
 * @Description Bird抽象类，继承自Animal类，并实现Flying接口
 */
public abstract class Bird extends Animal implements Flying {
    public Bird() {
    }

    public Bird(String name, int age) {
        super(name, age);
    }


}
