package chapter04.oop1;

/**
 * @author SDKany
 * @ClassName Test
 * @Date 2023/4/10 13:19
 * @Version V1.0
 * @Description 测试类
 */
public class Test {
    public static void main(String[] args) {
        //inner1Test();
        //inner2Test();
        //inner3Test();
        inner4Test();
    }

    private static void inner1Test() {
        Outer outer = new Outer();
        Outer.Inner1 inner1 = outer.new Inner1();
        inner1.show();
    }

    private static void inner2Test() {
        Outer.Inner2 inner2 = new Outer.Inner2();
        inner2.show();
    }

    private static void inner3Test() {
        Outer outer = new Outer();
        outer.test3();
    }
    private static void inner4Test() {
        Abs abs = new Abs() {
            @Override
            void test1() {
                System.out.println("这是一个重写了抽象类的匿名内部类中的方法，该方法重写了抽象类中的抽象方法！");
            }
        };

        abs.test1();

        Inter inter = new Inter() {
            @Override
            public void test1() {
                System.out.println("这是一个实现了接口的匿名内部类中的方法，该方法重写了接口中的抽象方法！");
            }

            @Override
            public void test2() {
                System.out.println("这是一个实现了接口的匿名内部类中的另一个方法！");
            }
        };
        inter.test1();
        inter.test2();

        execInter(new Inter() {
            @Override
            public void test1() {
                System.out.println("通过调用接口实现的匿名内部类方法1！");
            }

            @Override
            public void test2() {
                System.out.println("通过调用接口实现的匿名内部类方法2！");
            }
        });

        execAbs(new Abs() {
            @Override
            void test1() {
                System.out.println("通过调用抽象类实现的匿名内部类方法1！");
            }
        });
    }


    public static void execInter(Inter inter){
        inter.test1();
    }
    public static void execAbs(Abs abs){
        abs.test1();
    }
}
