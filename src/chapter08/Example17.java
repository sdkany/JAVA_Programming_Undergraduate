package chapter08;
import java.awt.event.*;
import javax.swing.*;
public class Example17 {
	private static void createAndShowGUI() {
		// 1、创建一个JFrame容器窗口
		JFrame f = new JFrame("JFrame窗口");
		f.setSize(300, 200);
		f.setLocation(300, 200);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 2、创建JPopupMenu弹出式菜单
		JPopupMenu popupMenu = new JPopupMenu();
		// 2.1、创建两个JMenuItem菜单项，并加入到JPopupMenu组件中
		JMenuItem item1 = new JMenuItem("查看");
		JMenuItem item2 = new JMenuItem("刷新");
		popupMenu.add(item1);
		popupMenu.addSeparator();
		popupMenu.add(item2);
		// 3、为JFrame窗口添加鼠标事件监听器
		f.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				// 如果单击的是鼠标右键，显示JPopupMenu菜单
				if (e.getButton() == MouseEvent.BUTTON3) {
					popupMenu.show(e.getComponent(), e.getX(), e.getY());
				}
			}
		});
	}
	public static void main(String[] args) {
		// 使用SwingUtilities工具类调用createAndShowGUI()方法并显示GUI程序
		SwingUtilities.invokeLater(Example17::createAndShowGUI);
	}
}

