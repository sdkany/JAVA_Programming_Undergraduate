package chapter05;

import java.time.LocalTime;

public class LocalTimeTest {
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        System.out.println("当前系统时间为："+ now);
        LocalTime ofLocalTime = LocalTime.of(10,05,16, 100002);
        System.out.println("生成的时间为："+ ofLocalTime);
        System.out.println("获取生成时间的小时数：" + ofLocalTime.getHour());
        System.out.println("获取生成时间的分钟数：" + ofLocalTime.getMinute());
        System.out.println("获取生成时间的秒数：" + ofLocalTime.getSecond());
        System.out.println("获取生成时间的秒数：" + ofLocalTime.getNano());
        System.out.println("生成时间是否早于当前系统时间？" + ofLocalTime.isBefore(now));
        System.out.println("生成时间是否晚于当前系统时间？" + ofLocalTime.isAfter(now));
        System.out.println("生成时间的具体时间是（不包含毫秒）：" + ofLocalTime.withNano(0));
        System.out.println("使用字符串解析生成时间：" + LocalTime.parse("12:23:33.11119866"));
        System.out.println("午夜的时间为：" + LocalTime.MIDNIGHT);
        System.out.println("中午的时间为：" + LocalTime.NOON);
    }
}
