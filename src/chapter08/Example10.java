package chapter08;
import java.awt.*;
import javax.swing.*;
public class Example10 {
	private static void createAndShowGUI() {
		// 1、创建一个JFrame容器窗口
		JFrame f = new JFrame("PanelDemo");
		Font font=new Font("宋体",Font.BOLD,40);
		f.setLayout(new BorderLayout());
		f.setSize(350, 200);
		f.setLocation(300, 200);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 2、创建JScrollPane滚动面板组件
		JScrollPane scrollPane = new JScrollPane();
		// 设置水平滚动条策略--滚动条需要时显示
		scrollPane.setHorizontalScrollBarPolicy
				(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		// 设置垂直滚动条策略--滚动条一直显示
		scrollPane.setVerticalScrollBarPolicy
				(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		// 定义一个JPanel面板组件
		JPanel panel = new JPanel();
		// 在JPanel面板中添加5个按钮
		for (int i = 0; i < 5; ) {
			JButton btn1 = new JButton("按钮" + ++i);
			btn1.setFont(font);
			panel.add(btn1);
		}
		// 设置JPanel面板在滚动面板JScrollPane中显示
		scrollPane.setViewportView(panel);
		// 4、向JFrame容器窗口中添加JScrollPane滚动面板组件
		f.add(scrollPane, BorderLayout.CENTER);
	}
	public static void main(String[] args) {
		// 使用SwingUtilities工具类调用createAndShowGUI()方法并显示GUI程序
		SwingUtilities.invokeLater(Example10::createAndShowGUI);
	}
}

