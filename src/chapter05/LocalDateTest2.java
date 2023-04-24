package chapter05;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @author SDKany
 * @ClassName LocalDateTest
 * @Date 2023/4/17 13:23
 * @Version V1.0
 * @Description LocalDate Test
 */
public class LocalDateTest2 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println("当前系统日期为："+ now);
        System.out.println("当前系统日期为："+ now.format(DateTimeFormatter.ofPattern("yyyy年MM月dd日")));
        System.out.println("当前系统日期为："+ now.format(DateTimeFormatter.ofPattern("yyyy===MM===dd")));
    }
}
