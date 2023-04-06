package chapter03.oop2.main;

/**
 * @author SDKany
 * @ClassName Tank
 * @Date 2023/4/6 15:51
 * @Version V1.0
 * @Description Tank 坦克类，展示访问控制权限
 */
public class Tank {
    public int publicInt;
    protected int protectedInt;
    int defaultInt;
    private int privateInt;

    public void publicMethod(){
        System.out.println("这是一个public方法");
    }
    protected void protectedMethod(){
        System.out.println("这是一个protected方法");
    }
    void defaultMethod(){
        System.out.println("这是一个default方法");
    }
    private void privateMethod(){
        System.out.println("这是一个private方法");
    }

    public static void main(String[] args){
        Tank tank = new Tank();

        tank.publicInt = 1;
        tank.protectedInt = 2;
        tank.defaultInt = 3;
        tank.privateInt = 4;

        tank.publicMethod();
        tank.protectedMethod();
        tank.defaultMethod();
        tank.privateMethod();
    }
}
