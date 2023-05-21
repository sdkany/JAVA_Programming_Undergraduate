package chapter08;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
// 自定义事件监听器类
class MyListener implements ActionListener{
	private int count = 0;
	// 实现监听器方法，对监听事件进行处理
	public void actionPerformed(ActionEvent e) {
		System.out.println("用户第" + (count++) + "次点击了JButton按钮组件");
	}
}
public class Example06 {
	private static void createAndShowGUI() {
		JFrame f = new JFrame("JFrame窗口");
		f.setSize(300, 200);
		f.setLocation(700,600);
		// 创建一个按钮组件，作为事件源
		JButton btn = new JButton("按钮");
		btn.setFont(new Font("宋体", Font.PLAIN, 40));
		// 为按钮组件事件源添加自定义监听器
		btn.addActionListener(new MyListener());
		btn.addFocusListener(new FocusListener() {
			@Override
			public void focusGained(FocusEvent e) {
				System.out.println("获得焦点");
			}
			@Override
			public void focusLost(FocusEvent e) {
				System.out.println("移除焦点");
			}
		});
		btn.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("鼠标点击btn");
			}

			@Override
			public void mousePressed(MouseEvent e) {
				System.out.println("鼠标按压下去了");
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				System.out.println("鼠标释放了");
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				System.out.println("鼠标进入btn区域");
			}

			@Override
			public void mouseExited(MouseEvent e) {
				System.out.println("鼠标移出btn区域");
			}
		});
		f.add(btn);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		// 使用SwingUtilities工具类调用createAndShowGUI()方法并显示GUI程序
		SwingUtilities.invokeLater(Example06::createAndShowGUI);
	}
}
