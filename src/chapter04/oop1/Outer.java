package chapter04.oop1;

/**
 * @author SDKany
 * @ClassName Outer
 * @Date 2023/4/10 13:07
 * @Version V1.0
 * @Description 外部类与内部类
 */
public class Outer {
    public static int m = 1024;
    public int n = 512;

    public void test1(){
        System.out.println("外部类的普通成员测试方法，test1");
    }

    public static void test2(){
        System.out.println("外部类的静态成员测试方法，test2");
    }

    class Inner1 { //成员内部类
        int n = 265;
        void show(){
            int n = 128;
            System.out.println("成员内部类的show方法");
            System.out.println("外部类的n=" + Outer.this.n + ", 外部类的m=" + Outer.m);
            System.out.println("成员内部类的n=" + this.n);
            System.out.println(n);
            System.out.println(Outer.this.a);
            test1();
            test2();
        }
    }

    public int a = 111;

    static class Inner2 { //静态内部类
        int n = 128;
        void show(){
            int n = 64;
            System.out.println("静态内部类的show方法");
            //System.out.println("外部类的n=" + Outer.this.n);
            System.out.println("外部类的m=" + Outer.m);
            System.out.println("静态内部类的n=" + this.n);
            //test1();
            test2();
        }
    }

    public void test3(){
        System.out.println("外部类的普通成员测试方法，test3");
        int a = 123;
        class Inner3 { //局部内部类
            int nn = 64;
            void show(){
                int n = 32;
                System.out.println("局部内部类的show方法");
                System.out.println("外部类的n=" + Outer.this.n + ", 外部类的m=" + Outer.m);
                System.out.println("局部内部类的n=" + this.nn);
                test1();
                test2();
                System.out.println(a);
                //System.out.println(b);
            }
        }
        int b = 234;
        Inner3 inner3 = new Inner3();
        inner3.show();
    }
}
