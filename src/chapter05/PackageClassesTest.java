package chapter05;

/**
 * @author SDKany
 * @ClassName PackageClassesTest
 * @Date 2023/4/24 13:27
 * @Version V1.0
 * @Description
 */
public class PackageClassesTest {
    public static void main(String[] args) {
        Byte aByte = 0x75;
        Character character = 'b';
        Integer integer = 1024;
        Float aFloat = 1.002f;
        Double aDouble = 1023.8888D;
        System.out.println("Byte转化为byte：" + aByte.byteValue());
        System.out.println("Character转化为char：" + character.charValue());
        System.out.println("Integer转化为int：" + integer.intValue());
        System.out.println("Float转化为float：" + aFloat.floatValue());
        System.out.println("Double转化为double：" + aDouble.doubleValue());
    }
}
