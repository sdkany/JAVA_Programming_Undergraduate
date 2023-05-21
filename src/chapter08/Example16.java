package chapter08;
import javax.swing.*;
import java.awt.*;

public class Example16 {
	private static void createAndShowGUI() {
		// 1、创建一个JFrame容器窗口
		JFrame f = new JFrame("JFrame窗口");
		Font font = new Font("宋体",Font.BOLD,40);
		f.setSize(550, 400);
		f.setLocation(300, 200);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 2、创建菜单栏组件JMenuBar
		JMenuBar menuBar = new JMenuBar();
		// 2.1、创建2个JMenu菜单组件，并加入JMenuBar中
		JMenu menu1 = new JMenu("文件(F)");
		JMenu menu2 = new JMenu("帮助(H)");
		menu1.setFont(font);
		menu2.setFont(font);
		menuBar.add(menu1);
		menuBar.add(menu2);
		// 2.2、创建2个JMenuItem菜单项组件，并加入JMenu中
		JMenuItem item1 = new JMenuItem("新建(N)");
		JMenuItem item2 = new JMenuItem("退出(X)");
		item1.setFont(font);
		item2.setFont(font);
		menu1.add(item1);
		menu1.addSeparator();   // 设置分隔符
		menu1.add(item2);
		// 2.3、分别创建2个JMenuItem菜单项监听器
		item1.addActionListener(e -> {
			// 创建一个JDialog弹窗
			JDialog dialog = new JDialog(f,"无标题",true);
			dialog.setFont(font);
			dialog.setSize(300, 200);
			dialog.setLocation(300, 200);
			dialog.setVisible(true);
			dialog.setDefaultCloseOperation(JDialog.HIDE_ON_CLOSE);
		});
		item2.addActionListener(e -> System.exit(0));
		// 3、向JFrame窗口容器中加入JMenuBar菜单组件
		f.setJMenuBar(menuBar);
	}
	public static void main(String[] args) {
		// 使用SwingUtilities工具类调用createAndShowGUI()方法并显示GUI程序
		SwingUtilities.invokeLater(Example16::createAndShowGUI);
	}
}

