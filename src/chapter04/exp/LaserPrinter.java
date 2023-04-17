package chapter04.exp;

/**
 * @author SDKany
 * @ClassName LaserPrinter
 * @Date 2023/4/17 14:08
 * @Version V1.0
 * @Description
 */
public class LaserPrinter extends Printer{
    @Override
    public void load(String[] contents) {
        print();
        buffer = contents;
    }

    @Override
    public void print() {
        if(buffer == null || buffer.length == 0){
            return;
        }
        for (int i = 0; i < buffer.length; i++){
            System.out.println(buffer[i]);
        }
//        for(String s:buffer){
//            System.out.println(s);
//        }
        buffer = null;
    }

    public static void main(String[] args) {
        LaserPrinter laserPrinter = new LaserPrinter();
        String[] contents = {"123", "456"};
        String[] contents2 = {"asd", "hjk"};
        laserPrinter.load(contents);
        laserPrinter.print();
        laserPrinter.load(contents2);
        laserPrinter.load(null);
    }
}
