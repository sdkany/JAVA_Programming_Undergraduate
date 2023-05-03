package chapter05;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

/**
 * @author SDKany
 * @ClassName PeriodTest
 * @Date 2023/4/24 13:18
 * @Version V1.0
 * @Description
 */
public class PeriodTest {
    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(2000, 1, 1);
        LocalDate now = LocalDate.of(2023, 4, 24);
        Period period = Period.between(birthday, now);
        System.out.println("两个日期相差：" + period.getYears() + "年");
        System.out.println("两个日期相差：" + period.getMonths() + "月");
        System.out.println("两个日期相差：" + period.getDays() + "日");
    }
}
