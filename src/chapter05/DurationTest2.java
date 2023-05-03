package chapter05;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalTime;

/**
 * @author SDKany
 * @ClassName DurationTest
 * @Date 2023/4/24 13:02
 * @Version V1.0
 * @Description
 */
public class DurationTest2 {
    public static void main(String[] args) {
        Instant now = Instant.now();
        Instant later = Instant.parse("2023-05-01T00:00:00.0Z");
        System.out.println("当前时间为：" + now);
        System.out.println("五一的时间为：" + later);
        Duration dura = Duration.between(now, later);
        System.out.println("两个时间之间的间隔为：" + dura.toDays() + "天");
        System.out.println("两个时间之间的间隔为：" + dura.toHours() + "小时");
        System.out.println("两个时间之间的间隔为：" + dura.toMinutes() + "分钟");
        System.out.println("两个时间之间的间隔为：" + dura.toMillis() + "毫秒");
        System.out.println("两个时间之间的间隔为：" + dura.toNanos() + "纳秒");
    }
}
