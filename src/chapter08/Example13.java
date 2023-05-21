package chapter08;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Example13 {
	private static void createAndShowGUI() {
		// 1、创建一个JFrame容器窗口
		JFrame f = new JFrame("JFrame窗口");
		f.setLayout(new BorderLayout());
		f.setSize(300, 300);
		f.setLocation(600, 500);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 2、创建一个JLabel标签组件，标签文本居中对齐
		JLabel label = new JLabel("Hello World!", JLabel.CENTER);
		label.setFont(new Font("宋体", Font.PLAIN, 40));
		// 3、创建一个JPanel面板组件
		JPanel panel = new JPanel();
		// 3.1、创建两个JCheckBox复选框，并添加到JPanel组件中
		JCheckBox italic = new JCheckBox("ITALIC");
		JCheckBox bold = new JCheckBox("BOLD");
		// 3.2、为复选框定义ActionListener监听器
		ActionListener listener = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int mode = 0;
				if (bold.isSelected())
					mode += Font.BOLD;
				if (italic.isSelected())
					mode += Font.ITALIC;
				label.setFont(new Font("宋体", mode, 40));
			}
		};
		// 3.3、为两个复选框添加监听器
		italic.addActionListener(listener);
		bold.addActionListener(listener);
		// 3.4、在JPanel面板面板添加复选框
		panel.add(italic);
		panel.add(bold);
		// 4、向JFrame窗口容器中加入居中的JLabel标签组件和页尾的JPanel面板组件
		f.add(label);
		f.add(panel, BorderLayout.PAGE_END);
	}
	public static void main(String[] args) {
		// 使用SwingUtilities工具类调用createAndShowGUI()方法并显示GUI程序
		SwingUtilities.invokeLater(Example13::createAndShowGUI);
	}
}

