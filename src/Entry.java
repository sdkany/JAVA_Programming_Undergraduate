/**
 * @author SDKany
 * @ClassName Entry
 * @Date 2023/5/19 15:24
 * @Version V1.0
 * @Description
 */
public class Entry {
    final double max;
    final double min;

    public Entry(double max, double min) {
        this.max = max;
        this.min = min;
    }

    public static Entry compare(double a, double b){
        if (a >  b)
            return new Entry(a,b);
        return new Entry(b,a);
    }

    public static void main(String[] args) {
        double a = 0.1;
        double b = 1;
        Entry entry = Entry.compare(a,b);
        System.out.println("较大值是：" + entry.max);
    }
}
