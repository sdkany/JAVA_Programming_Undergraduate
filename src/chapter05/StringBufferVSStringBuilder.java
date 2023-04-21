package chapter05;

public class StringBufferVSStringBuilder {
    private static final int TIMES = 300000;
    public static void main(String[] args) {
        testString();
        testStringBuffer();
        testStringBuilder();
    }
    public static void testString(){
        String string = "";
        long start = System.currentTimeMillis();
        for (int i = 0; i < TIMES; i++) {  string += "test";  }
        long end = System.currentTimeMillis();
        System.out.println("String执行" + TIMES + "次的时间为：" + (end - start) + "ms");
    }
    public static void testStringBuffer(){
        StringBuffer stringBuffer = new StringBuffer();
        long start = System.currentTimeMillis();
        for (int i = 0; i < TIMES; i++) {  stringBuffer.append("test");  }
        long end = System.currentTimeMillis();
        System.out.println("StringBuffer执行" + TIMES + "次的时间为：" + (end - start) + "ms");
    }
    public static void testStringBuilder(){
        StringBuilder stringBuilder = new StringBuilder();
        long start = System.currentTimeMillis();
        for (int i = 0; i < TIMES; i++) {  stringBuilder.append("test");  }
        long end = System.currentTimeMillis();
        System.out.println("stringBuilder执行" + TIMES + "次的时间为：" + (end - start) + "ms");
    }
}
