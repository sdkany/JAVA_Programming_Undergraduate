package chapter08;
import java.awt.event.*;
import javax.swing.*;
public class Example07 {
	private static void createAndShowGUI() {
		JFrame f = new JFrame("WindowEvent");
		f.setSize(400, 300);
		f.setLocation(600, 600);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 使用内部类创建WindowListener实例对象，监听窗体事件
		f.addWindowListener(new WindowListener() {
			public void windowOpened(WindowEvent e) {
				System.out.println("windowOpened---窗体打开事件");
			}
			public void windowIconified(WindowEvent e) {
				System.out.println("windowIconified---窗体图标化事件");
			}
			public void windowDeiconified(WindowEvent e) {
				System.out.println("windowDeiconified---窗体取消图标化事件");
			}
			public void windowDeactivated(WindowEvent e) {
				System.out.println("windowDeactivated---窗体停用事件");
			}
			public void windowClosing(WindowEvent e) {
				System.out.println("windowClosing---窗体正在关闭事件");
			}
			public void windowClosed(WindowEvent e) {
				System.out.println("windowClosed---窗体关闭事件");
			}
			public void windowActivated(WindowEvent e) {
				System.out.println("windowActivated---窗体激活事件");
			}
		});
	}
	public static void main(String[] args) {
		// 使用SwingUtilities工具类调用createAndShowGUI()方法执行并显示GUI程序
		SwingUtilities.invokeLater(Example07::createAndShowGUI);
	}
}
