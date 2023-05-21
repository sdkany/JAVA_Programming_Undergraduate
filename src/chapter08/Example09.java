package chapter08;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Example09 {
	private static void createAndShowGUI() {
		JFrame f = new JFrame("KeyEvent");
		f.setLayout(new FlowLayout());
		f.setSize(400, 300);
		f.setLocation(600, 600);
		JTextField tf = new JTextField(30); // 创建文本框对象
		f.add(tf);                          // 在窗口中添加文本框组件
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         // 为文本框添加键盘事件监听器
		tf.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				// 获取对应的键盘字符
				char keyChar = e.getKeyChar();
				// 获取对应的键盘字符代码
				int keyCode = e.getKeyCode();
				System.out.print("键盘按下的字符内容为：" + keyChar+" ");
				System.out.println("键盘按下的字符代码为：" + keyCode);
			}
		});
	}
	public static void main(String[] args) {
		// 使用SwingUtilities工具类调用createAndShowGUI()方法并显示GUI程序
		//SwingUtilities.invokeLater(Example09::createAndShowGUI);
		EventQueue.invokeLater(Example09::createAndShowGUI);
	}
}


