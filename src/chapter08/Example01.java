package chapter08;
import javax.swing.*;
import java.awt.*;

public class Example01 {
    private static void createAndShowGUI() {
        // 创建并设置JFrame容器窗口
        JFrame frame = new JFrame("JFrameTest");
        // 设置关闭窗口时的默认操作
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 设置窗口尺寸
        frame.setSize(450, 350);
        // 设置窗口内容的背景颜色getContentPane()是为了获取窗口的容器，窗口本身中不能直接添加组件或者设置背景
        frame.getContentPane().setBackground(Color.BLUE);
        frame.setLocation(400,100);
        frame.pack();
        // 展示JFrame容器窗口
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        //使用SwingUtilities工具类调用createAndShowGUI()方法显示GUI程序
        SwingUtilities.invokeLater(Example01::createAndShowGUI);
    }
}
