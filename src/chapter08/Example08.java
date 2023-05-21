package chapter08;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Example08 {
	private static void createAndShowGUI() {
		JFrame f = new JFrame("MouseEvent");
		f.setLayout(new FlowLayout());       // 为窗口设置布局
		f.setSize(300, 200);
		f.setLocation(600, 600);
		f.setVisible(true);
         f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton but = new JButton("Button");// 创建按钮对象
		f.add(but);                         // 在窗口添加按钮组件
		// 为按钮添加鼠标事件监听器
		but.addMouseListener(new MouseListener() {
			public void mouseReleased(MouseEvent e) {
				System.out.println("mouseReleased-鼠标放开事件");
			}
			public void mousePressed(MouseEvent e) {
				if(e.getButton() == MouseEvent.BUTTON1)
					System.out.println("Left mousePressed-鼠标按下事件");
				if(e.getButton() == MouseEvent.BUTTON2)
					System.out.println("Middle mousePressed-鼠标按下事件");
				if(e.getButton() == MouseEvent.BUTTON3)
					System.out.println("Right mousePressed-鼠标按下事件");
			}
			public void mouseExited(MouseEvent e) {
				System.out.println("mouseExited—鼠标移出按钮区域事件");
			}
			public void mouseEntered(MouseEvent e) {
				System.out.println("mouseEntered—鼠标进入按钮区域事件");
			}
			public void mouseClicked(MouseEvent e) {
				System.out.println("mouseClicked-鼠标完成单击事件");
			}
		});
	}
	public static void main(String[] args) {
		// 使用SwingUtilities工具类调用createAndShowGUI()方法并显示GUI程序
		SwingUtilities.invokeLater(Example08::createAndShowGUI);
	}
}


