/**
 * @author SDKany
 * @ClassName Test1
 * @Date 2023/5/14 9:25
 * @Version V1.0
 * @Description
 */
public class Test1 {
    public static void main(String[] args) {
        int m = 8;
        int item = 8;
        int sum = 0;
        for (int i = 0; i < 10; i ++){
            sum = sum + item;
            item = item * 10 + m;
        }
        System.out.println(sum);
    }
}
//9876543200
//1286608608
