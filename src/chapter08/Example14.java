package chapter08;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Example14 {
	private static void createAndShowGUI() {
		// 1、创建一个JFrame容器窗口
		JFrame f = new JFrame("JFrame窗口");
		Font font=new Font("宋体",Font.BOLD,40);
		f.setLayout(new BorderLayout());
		f.setSize(300, 300);
		f.setLocation(600, 500);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 2、创建一个JLabel标签组件，标签文本居中对齐
		JLabel label = new JLabel("Hello World!",JLabel.CENTER);
		label.setFont(new Font("宋体", Font.PLAIN, 40));
		// 3、创建一个页尾的JPanel面板组件，来封装ButtonGroup组件
		JPanel panel = new JPanel();
		// 3.1、创建一个ButtonGroup按钮组组件
		ButtonGroup group = new ButtonGroup();
		// 3.2、创建二个JRadioButton单选按钮组件
		JRadioButton italic = new JRadioButton("ITALIC");
		italic.setFont(new Font("宋体",  Font.PLAIN, 40));
		JRadioButton bold = new JRadioButton("BOLD");
		bold.setFont(new Font("宋体",  Font.PLAIN, 40));
		// 3.3、将二个JRadioButton单选按钮组件加入到同一个ButtonGroup组中
		group.add(italic);
		group.add(bold);
		// 3.4、为二个JRadioButton单选按钮组件注册动作监听器
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
		// 3.5、为二个复选框添加监听器
		italic.addActionListener(listener);
		bold.addActionListener(listener);
		// 3.6、将二个JRadioButton单选按钮组件加入到页尾的JPanel组件中
		panel.add(italic);
		panel.add(bold);
		// 4、向JFrame容器中分别加入居中的JLabel标签组件和页尾的JPanel面板组件
		f.add(label);
		f.add(panel, BorderLayout.PAGE_END);
	}
	public static void main(String[] args) {
		// 使用SwingUtilities工具类调用createAndShowGUI()方法显示GUI程序
		SwingUtilities.invokeLater(Example14::createAndShowGUI);
	}
}

