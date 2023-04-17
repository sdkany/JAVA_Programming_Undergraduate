package chapter04.exp;

/**
 * @author SDKany
 * @ClassName Printer
 * @Date 2023/4/17 14:04
 * @Version V1.0
 * @Description
 */
public abstract class Printer {
    protected String[] buffer;
    public abstract void load(String[] contents) throws Exception;
    public abstract void print();
}
