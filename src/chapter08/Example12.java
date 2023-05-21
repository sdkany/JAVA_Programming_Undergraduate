package chapter08;
import java.awt.*;
import javax.swing.*;
public class Example12 {
	private static void createAndShowGUI() {
		// 1、创建一个JFrame容器窗口
		JFrame f = new JFrame("JFrame窗口");
		f.setLayout(new BorderLayout());
		f.setSize(400, 350);
		f.setLocation(500, 500);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 2、创建一个JLabel标签组件，用来展示图片
		JLabel label1 = new JLabel();
		// 2.1、创建一个ImageIcon图标组件，并加入JLabel中
		ImageIcon icon = new  ImageIcon("fruit.jpg");
		Image img = icon.getImage();
		// 2.2、用于设置图片大小尺寸
		img = img.getScaledInstance(400, 250, Image.SCALE_DEFAULT);
		icon.setImage(img);  
		label1.setIcon(icon);
		// 3、创建一个页尾JPanel面板，并加入JLabel标签组件
		JPanel panel = new JPanel();
		JLabel label2 = new JLabel("欢迎进入水果超市",JLabel.CENTER);
		panel.add(label2);
		// 4、向JFrame聊天窗口容器的顶部和尾部分别加入JLabel和JPanel组件
		f.add(label1, BorderLayout.PAGE_START);
		f.add(panel, BorderLayout.PAGE_END);
	}
	public static void main(String[] args) {
		// 使用SwingUtilities工具类调用createAndShowGUI()方法并显示GUI程序
		SwingUtilities.invokeLater(Example12::createAndShowGUI);
	}
}

