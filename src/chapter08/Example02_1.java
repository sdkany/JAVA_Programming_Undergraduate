package chapter08;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Example02_1 {
    private static void createAndShowGUI() {
        // 创建并设置JFrame容器窗口
        JFrame frame = new JFrame("JFrameTest");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(550, 350);
        frame.setLocation(1000,300);
        frame.setLayout(new FlowLayout());
        JButton button1 = new JButton("模态对话框");
        JButton button2 = new JButton("非模态对话框");
        button1.setFont(new Font(null, 0, 40));
        button2.setFont(new Font(null, 0, 40));
        frame.add(button1);
        frame.add(button2);
        frame.setVisible(true);
        // 在JFrame容器窗口基础上创建并设置JDialog容器窗口
        JDialog dialog = new JDialog(frame, "JDialog对话框");
        dialog.setDefaultCloseOperation(JDialog.HIDE_ON_CLOSE);
        dialog.setSize(300, 200);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dialog.setLocation(1200,350);
                dialog.setTitle("JDialog模态对话框");
                dialog.setModal(true);
                dialog.setVisible(true);
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dialog.setLocation(1200,350);
                dialog.setTitle("JDialog非模态对话框");
                dialog.setModal(false);
                dialog.setVisible(true);
            }
        });
    }
    public static void main(String[] args) {
    	// 使用SwingUtilities工具类调用createAndShowGUI()方法执行并显示GUI程序
        SwingUtilities.invokeLater(Example02_1::createAndShowGUI);
    }
}

