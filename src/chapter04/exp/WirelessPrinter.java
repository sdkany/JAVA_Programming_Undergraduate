package chapter04.exp;

/**
 * @author SDKany
 * @ClassName WirelessPrinter
 * @Date 2023/4/17 14:20
 * @Version V1.0
 * @Description
 */
public class WirelessPrinter extends Printer implements Wireless{

    private boolean status;

    @Override
    public void load(String[] contents) throws Exception {
        print();
        if(status){
            buffer = contents;
        }else {
            throw new Exception("无线打印机未联网！");
        }
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

    @Override
    public void wirelessConnect() {
        status = true;
    }

    public static void main(String[] args) {
        WirelessPrinter wirelessPrinter = new WirelessPrinter();
        String[] contents = {"123", "456"};
        String[] contents2 = {"asd", "hjk"};

        //wirelessPrinter.wirelessConnect();
        boolean flag = false;
        try {
            wirelessPrinter.load(contents);
            flag = true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } finally {
            wirelessPrinter.wirelessConnect();
        }
        if(!flag){
            try {
                wirelessPrinter.load(contents);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        wirelessPrinter.print();

        if(wirelessPrinter instanceof Wireless) System.out.println("无线打印机是无线设备！");

//        boolean flag = false;
//        try {
//            wirelessPrinter.load(contents);
//            flag = true;
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        } finally {
//            wirelessPrinter.wirelessConnect();
//        }
//        if (!flag){
//            try {
//                wirelessPrinter.load(contents);
//            } catch (Exception e) {
//                System.out.println(e.getMessage());
//            }
//        }
//        wirelessPrinter.print();
    }
}
