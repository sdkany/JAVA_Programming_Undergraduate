package chapter08;
import java.awt.*;
import javax.swing.*;
public class Example03 {
	private static void createAndShowGUI() {
		// 创建一个名为BorderLayout的顶级容器窗口
		JFrame f = new JFrame("BorderLayout");
		// 设置窗体中的布局管理器为BorderLayout
		f.setLayout(new BorderLayout());
		f.setSize(300, 300);     // 设置窗体大小
		f.setLocation(300, 200); // 设置窗体显示的位置
		// 下面的代码是创建5个按钮组件
		JButton but1 = new JButton("PAGE_START");
		JButton but2 = new JButton("PAGE_END");
		JButton but3 = new JButton("LINE_START");
		JButton but4 = new JButton("LINE_END");
		JButton but5 = new JButton("CENTER");
		// 下面的代码是将创建好的按钮组件添加到窗体中，并设置按钮所在的区域
		f.add(but1, BorderLayout.PAGE_START);
		f.add(but2, BorderLayout.PAGE_END);
		f.add(but3, BorderLayout.LINE_START);
		f.add(but4, BorderLayout.LINE_END);
		f.add(but5, BorderLayout.CENTER);
		f.setVisible(true);  // 设置窗体可见
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		SwingUtilities.invokeLater(Example03::createAndShowGUI);
	}
}
