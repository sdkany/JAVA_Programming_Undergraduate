import chapter08.Example07;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author SDKany
 * @ClassName Exp07
 * @Date 2023/6/9 13:59
 * @Version V1.0
 * @Description
 */
public class Exp07 {
    private static void createAndShowGUI() {
        JFrame f = new JFrame("记事本");
        Font font = new Font("微软雅黑", Font.PLAIN,18);
        f.setSize(805, 600);
        f.setLocation(600, 600);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(new FlowLayout());

        JTextArea ta = new JTextArea("");
        ta.setFont(font);
        JScrollPane jScrollPane = new JScrollPane(ta, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        ta.setEditable(true);
        f.add(jScrollPane);
        f.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                ta.setColumns(f.getWidth() / 17 - 2 > 0 ? f.getWidth() / 17 - 2 : 1);
                ta.setRows((int)((f.getHeight() - 100) * 0.03) > 0 ? (int)((f.getHeight() - 100) * 0.032) : 1);
            }
        });

        JLabel jLabel = new JLabel("当前文本共0个字符", JLabel.CENTER);
        jLabel.setFont(font);
        f.add(jLabel);
        ta.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                jLabel.setText("当前文本共" + ta.getText().length() + "个字符");
                jLabel.repaint();
            }

            @Override
            public void keyPressed(KeyEvent e) {
                jLabel.setText("当前文本共" + ta.getText().length() + "个字符");
                jLabel.repaint();
            }

            @Override
            public void keyReleased(KeyEvent e) {
                jLabel.setText("当前文本共" + ta.getText().length() + "个字符");
                jLabel.repaint();
            }
        });
        ta.addInputMethodListener(new InputMethodListener() {
            @Override
            public void inputMethodTextChanged(InputMethodEvent event) {
                jLabel.setText("当前文本共" + ta.getText().length() + "个字符");
                jLabel.repaint();
            }

            @Override
            public void caretPositionChanged(InputMethodEvent event) {
                jLabel.setText("当前文本共" + ta.getText().length() + "个字符");
                jLabel.repaint();
            }
        });
        f.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                f.repaint();
                jLabel.setText("当前文本共" + ta.getText().length() + "个字符");
            }

            @Override
            public void focusLost(FocusEvent e) {

            }
        });
        JButton clearButton = new JButton("清空");
        clearButton.setFont(font);
        f.add(clearButton);
        clearButton.addActionListener(e -> {
            ta.setText("");
            jLabel.setText("当前文本共" + ta.getText().length() + "个字符");
            jLabel.repaint();
        });

        JMenuBar menuBar = new JMenuBar();
        JMenu menu1 = new JMenu("文件");
        menu1.setFont(font);
        JMenu menu2 = new JMenu("信息");
        menu2.setFont(font);
        menuBar.add(menu1);
        menuBar.add(menu2);
        JMenuItem newItem = new JMenuItem("新建");
        newItem.setFont(font);
        JMenuItem saveItem = new JMenuItem("保存");
        saveItem.setFont(font);
        menu1.add(newItem);
        menu1.add(saveItem);
        JMenuItem infoItem = new JMenuItem("统计");
        infoItem.setFont(font);
        infoItem.addActionListener(e -> {
                    // 创建一个JDialog弹窗
                    JDialog dialog = new JDialog(f,"统计信息",true);
                    dialog.setSize(300, 200);
                    dialog.setLocation(300, 200);
                    JLabel jLabel1 = new JLabel("当前文本共" + ta.getText().length() + "个字符", JLabel.CENTER);
                    jLabel1.setFont(font);
                    dialog.add(jLabel1);
                    dialog.setVisible(true);
                    dialog.setDefaultCloseOperation(JDialog.HIDE_ON_CLOSE);
                    dialog.repaint();
                });
        menu2.add(infoItem);
        newItem.addActionListener(e -> {
            ta.setText("");
            jLabel.setText("当前文本共" + ta.getText().length() + "个字符");
            jLabel.repaint();
        });
        JButton saveButton = new JButton("保存");
        saveButton.setFont(font);
        JTextField path = new JTextField(20);
        path.setFont(font);
        JDialog saveDialog = new JDialog(f,"保存",true);
        saveItem.addActionListener(e -> {
            // 创建一个JDialog弹窗
            path.setText("");
            saveDialog.setSize(400, 200);
            saveDialog.setLocation(300, 200);
            JPanel jPanel = new JPanel();
            JLabel label = new JLabel("请输入文件存储信息：", JLabel.CENTER);
            label.setFont(font);
            jPanel.add(label);
            jPanel.add(path);
            jPanel.add(saveButton);
            saveDialog.add(jPanel);
            saveDialog.setVisible(true);
            saveDialog.setDefaultCloseOperation(JDialog.HIDE_ON_CLOSE);
            saveDialog.repaint();
        });
        saveButton.addActionListener(e -> {
            String pathString = path.getText();
            if(pathString == null || pathString.isEmpty()){

            }else{
                FileWriter fileWriter = null;
                try {
                    fileWriter = new FileWriter(pathString);
                    fileWriter.write(ta.getText());
                } catch (IOException ex) {
                    ex.printStackTrace();
                }finally {
                    if (fileWriter != null) {
                        try {
                            fileWriter.close();
                        } catch (IOException ex) {
                            ex.printStackTrace();
                        }
                    }
                }
            }
        });
        f.setJMenuBar(menuBar);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Exp07::createAndShowGUI);
    }
}
