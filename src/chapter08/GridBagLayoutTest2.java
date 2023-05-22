package chapter08;

import javax.swing.*;
import java.awt.*;

/**
 * @author SDKany
 * @ClassName GridBagLayoutTest
 * @Date 2023/5/21 13:55
 * @Version V1.0
 * @Description
 */
public class GridBagLayoutTest2 extends JFrame {

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("GridBagLayout布局管理器");
        GridBagLayout layout = new GridBagLayout();
        frame.setLayout(layout);
        frame.setSize(800, 800);
        frame.setLocation(1400, 400);
        Button btn1 = new Button("btn1");
        layout.setConstraints(btn1,
                new GridBagConstraints(0,0,1, 1,
                1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 0, 0), 0, 0));
        frame.add(btn1);
        Button btn2 = new Button("btn2");
        layout.setConstraints(btn2,
                new GridBagConstraints(1,0,1, 2,
                        3, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 0, 0), 0, 0));
        frame.add(btn2);
        Button btn3 = new Button("btn3");
        layout.setConstraints(btn3,
                new GridBagConstraints(0,1,1, 1,
                        3, 3, GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 0, 0), 0, 0));
        frame.add(btn3);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(GridBagLayoutTest2::createAndShowGUI);
    }
}
