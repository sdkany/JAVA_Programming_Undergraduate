package chapter08;
import java.awt.*;
import javax.swing.*;
public class Example04 {
	private static void createAndShowGUI() {
		// 创建一个名为Flowlayout的窗体
		JFrame f = new JFrame("Flowlayout"); 
		// 设置窗体中的布局管理器为FlowLayout，
		// 所有组件左对齐，水平间距为20，垂直间距为30
		f.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 30));
		f.setSize(400, 200);                 // 设置窗体大小
		f.setLocation(300, 200);             // 设置窗体显示的位置
		// 向容器添加组件
		f.add(new JButton("第1个按钮"));  
		f.add(new JButton("第2个按钮"));
		f.add(new JButton("第3个按钮"));  
		f.add(new JButton("第4个按钮"));
		f.add(new JButton("第5个按钮"));  
		f.setVisible(true);                  // 设置窗体可见
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		// 使用SwingUtilities工具类调用createAndShowGUI()方法执行并显示GUI程序
		SwingUtilities.invokeLater(Example04::createAndShowGUI);
	}
}
