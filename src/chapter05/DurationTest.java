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
public class DurationTest {
    public static void main(String[] args) {
        LocalTime start = LocalTime.of(14, 00, 00);
        LocalTime end = LocalTime.of(15, 35, 05);
        Duration duration = Duration.between(start, end);
        System.out.println("两个时间之间的间隔为：" + duration.toHours() + "小时");
        System.out.println("两个时间之间的间隔为：" + duration.toMinutes() + "分钟");
        System.out.println("两个时间之间的间隔为：" + duration.toMillis() + "毫秒");
        System.out.println("两个时间之间的间隔为：" + duration.toNanos() + "纳秒");
    }
}
