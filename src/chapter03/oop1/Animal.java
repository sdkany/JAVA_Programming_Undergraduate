package chapter03.oop1;

/**
 * @author SDKany
 * @ClassName Test4
 * @Date 2023/4/6 15:51
 * @Version V1.0
 * @Description Animal 动物类，展示基本的类的概念、类的实例化、引用传递等。
 */
public class Animal extends Object{
    String name;
    int age;

//    @Override
//    public void finalize(){
//        System.out.println("对象被回收了");
//    }

    public static void main(String[] args){
        Animal animal1 = new Animal();
        animal1.age = 10;
        animal1.name = "大黄";

        Animal animal2 = new Animal();
        animal2.age = 2;
        animal2.name = "小强";

        System.out.println("第一只动物的名字是：" + animal1.name);
        System.out.println("第一只动物的年龄是：" + animal1.age);

        System.out.println("第二只动物的名字是：" + animal2.name);
        System.out.println("第二只动物的年龄是：" + animal2.age);

        animal2 = animal1;

        System.gc();

        System.out.println("当进行animal2 = animal1操作后");
        System.out.println("第二只动物的名字是：" + animal2.name);
        System.out.println("第二只动物的年龄是：" + animal2.age);

        animal2.name = "小白";

        System.out.println("当进行animal2.name = \"小白\"操作后");
        System.out.println("第一只动物的名字是：" + animal1.name);
        System.out.println("第一只动物的年龄是：" + animal1.age);
    }
}
