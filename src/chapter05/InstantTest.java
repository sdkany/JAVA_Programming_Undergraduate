package chapter05;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * @author SDKany
 * @ClassName InstantTest
 * @Date 2023/4/16 21:44
 * @Version V1.0
 * @Description Instant Test Class
 */
public class InstantTest {
    public static void main(String[] args) {
        Instant now = Instant.now();
        System.out.println("当前系统时间为:" + now); // now的时间为UTC时间，比北京时间（东八区）晚8个小时
        System.out.println("当前系统时间获取的秒数为:" + now.getEpochSecond());
        System.out.println("当前系统时间获取的纳秒数为:" + now.getNano());

        Instant instant1 = Instant.ofEpochSecond(1);
        System.out.println("Java计算时代开始后1秒的时间为:" + instant1);

        Instant instant2 = Instant.ofEpochMilli(1000 * 60 * 60 * 24);
        System.out.println("Java计算时代开始后1000 * 60 * 60 * 24毫秒的时间为:" + instant2);

        Instant instant3 = Instant.parse("2023-04-15T13:08:19.886Z");
        System.out.println("instant3的时间为："+instant3);

        System.out.println("从时间对象获取的Instant实例为：" + Instant.from(now));

        ZonedDateTime zonedDateTime = now.atZone(ZoneId.of("Asia/Shanghai"));
        System.out.println(zonedDateTime);
    }
}
