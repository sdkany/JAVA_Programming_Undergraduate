package chapter05;

import java.time.LocalDate;

/**
 * @author SDKany
 * @ClassName LocalDateTest
 * @Date 2023/4/17 13:23
 * @Version V1.0
 * @Description LocalDate Test
 */
public class LocalDateTest {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println("当前系统日期为："+ now);
        System.out.println("当前系统日期的年份为：" + now.getYear());
        System.out.println("当前系统日期的月份为：" + now.getMonth());
        System.out.println("当前系统日期的月份为：" + now.getMonthValue());
        System.out.println("当前系统日期的日为：" + now.getDayOfMonth());
        System.out.println("当前系统日期为星期几？" + now.getDayOfWeek());
        System.out.println("当前系统日期为本年的第几天？" + now.getDayOfYear());
        LocalDate localDate = LocalDate.of(2023, 4, 15);
        System.out.println("生成的日期localDate为：" + localDate);
        System.out.println("生成的日期localDate早于当前时间吗？" + localDate.isBefore(now));
        System.out.println("生成的日期localDate晚于当前时间吗？" + localDate.isAfter(now));

        LocalDate localDate1 = localDate.plusDays(2);
        System.out.println("生成的日期加上2天之后为：" + localDate1);
        System.out.println("localDate1等于当前时间吗？" + localDate1.isEqual(now));
        localDate.withDayOfMonth(1);

        System.out.println("将当前日期的年份设置为2024后为：" + now.withYear(2024));
    }
}
