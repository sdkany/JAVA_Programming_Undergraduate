package chapter08;
import java.awt.*;
import javax.swing.*;
public class Example15 {
	private static void createAndShowGUI() {
		// 1、创建一个JFrame容器窗口
		JFrame f = new JFrame("JFrame窗口");
		f.setLayout(new BorderLayout());
		f.setSize(300, 300);
		f.setLocation(600, 500);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 2、创建一个页头的JPanel面板,用来封装JComboBox下拉框组件
		JPanel panel = new JPanel();
		// 2.1、创建JComboBox下拉框组件
		JComboBox<String> comboBox = new JComboBox<>();
		// 2.2、为下拉框添加选项
		comboBox.addItem("请选择城市");
		comboBox.addItem("北京");
		comboBox.addItem("天津");
		comboBox.addItem("南京");
		comboBox.addItem("上海");
		// 2.3、创建JTextField单行文本框组件，用来展示用户选择项
		JTextField textField = new JTextField(20);
		// 2.4、为JComboBox下拉框组件注册动作监听器
		comboBox.addActionListener(e -> {
			String item = (String) comboBox.getSelectedItem();
			if ("请选择城市".equals(item)) {
				textField.setText("");
			} else {
				textField.setText("您选择的城市是：" + item);
			}
		});
		// 2.5、将JComboBox组件和JTextField组件加入JPanel面板组件中
		panel.add(comboBox); 
		panel.add(textField); 
		// 4、向JFrame窗口容器中加入页头的JPanel面板组件
		f.add(panel, BorderLayout.PAGE_START);
	}
	public static void main(String[] args) {
		// 使用SwingUtilities工具类调用createAndShowGUI()方法并显示GUI程序
		SwingUtilities.invokeLater(Example15::createAndShowGUI);
	}
}

