package chapter05;

import java.util.Random;

/**
 * @author SDKany
 * @ClassName RandomTest
 * @Date 2023/4/24 12:38
 * @Version V1.0
 * @Description
 */
public class RandomTest {
    public static void main(String[] args) {
        long seed = 12345678987654321L;
        Random random1 = new Random(seed);
        int number1 = random1.nextInt(100000);
        System.out.println("number1 = " + number1);

        Random random2 = new Random(seed);
        int number2 =random2.nextInt(100000);
        System.out.println("number2 = " + number2);
    }
}
