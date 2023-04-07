package chapter03.oop2.main;

/**
 * @author SDKany
 * @ClassName Test1
 * @Date 2023/4/6 15:51
 * @Version V1.0
 * @Description Test1 测试类1，与Tank类在同一个包中
 */
public class Test1 {

    public static void main(String[] args) {
        Tank tank = new Tank();

        tank.publicInt = 1;
        tank.protectedInt = 2;
        tank.defaultInt = 3;
 //       tank.privateInt = 4;
//
        tank.publicMethod();
        tank.protectedMethod();
        tank.defaultMethod();
 //       tank.privateMethod();
    }
}
