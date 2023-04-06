package chapter04.oop3.abstracts;

/**
 * @author SDKany
 * @ClassName Animal
 * @Date 2023/4/6 15:51
 * @Version V1.0
 * @Description Animal 动物抽象类，拥有私有成员变量，成员方法，构造方法等，体现构造方法的重载性质，面向对象的封装性
 */
public abstract class Animal {
    private String name;
    private int age;

    public Animal() {
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract void shout();

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
