package chapter03.oop3;

/**
 * @author SDKany
 * @ClassName People
 * @Date 2023/4/6 15:51
 * @Version V1.0
 * @Description People类，封装，构造函数重载
 */
public class People {
    private String name;
    private int age;
    private boolean sexual;

    public People() {
    }

    public People(String name, int age, boolean sexual) {
        this.name = name;
        setAge(age);
        this.sexual = sexual;
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
        if (age >= 0)
            this.age = age;
        else
            throw new IllegalArgumentException("People年龄不能为负数");
    }

    public boolean isSexual() {
        return sexual;
    }

    public void setSexual(boolean sexual) {
        this.sexual = sexual;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sexual=" + sexual +
                '}';
    }

    public static void main(String[] args) {
        People people = new People("张三", 18, false);
        System.out.println(people);

        People people2 = null;
        try{
            people2 = new People("张三", -2, true);
        } catch (Exception e){
            System.out.println(e.getMessage());
        } finally {
            people2 = new People();
        }
        System.out.println(people2);
    }
}
