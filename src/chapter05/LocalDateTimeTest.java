package chapter05;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author SDKany
 * @ClassName LocalDateTimeTest
 * @Date 2023/4/24 12:52
 * @Version V1.0
 * @Description
 */
public class LocalDateTimeTest {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("当前系统的日期时间为：" + now);
        System.out.println("将LocalDateTime转换为LocalDate：" + now.toLocalDate());
        System.out.println("将LocalDateTime转换为LocalTime：" + now.toLocalTime());
        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("yyyy年MM月dd日hh时mm分ss秒");
        System.out.println("格式化后的日期时间为：" + now.format(formatter));
    }
}
