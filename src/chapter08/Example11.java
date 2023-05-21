package chapter08;
import java.awt.*;
import javax.swing.*;
public class Example11 {
	private static void createAndShowGUI() {
		// 1、创建一个JFrame聊天窗口
		JFrame f = new JFrame("聊天窗口");
		f.setLayout(new BorderLayout());
		f.setSize(400, 300);
		f.setLocation(300, 200);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 2、创建一个JTextArea文本域，用来显示多行聊天信息
		JTextArea showArea = new JTextArea(12, 34);
		// 创建一个JScrollPane滚动面板组件，将JTextArea文本域作为其显示组件
		JScrollPane scrollPane = new JScrollPane(showArea);
		showArea.setEditable(false); // 设置文本域不可编辑
		// 3、创建一个JTextField文本框，用来输入单行聊天信息
		JTextField inputField = new JTextField(20);
		JButton btn = new JButton("发送"); 
		// 为按钮添加监听事件
		btn.addActionListener(e -> {
			String content = inputField.getText();
			// 判断输入的信息是否为空
			if (content != null && !content.trim().equals("")) {
				// 如果不为空，将输入的文本追加到到聊天窗口
				showArea.append("本人输入信息:" + content + "\n");
			} else {
				// 如果为空，提示聊天信息不能为空
				showArea.append("聊天信息不能为空！！！" + "\n");
			}
			inputField.setText(""); // 将输入的文本域内容置为空
		});
		// 3、创建一个JPanel面板组件
		JPanel panel = new JPanel();
		JLabel label = new JLabel("聊天信息");// 创建一个标签
		panel.add(label);                  // 将标签组件添加到JPanel面板
		panel.add(inputField);             // 将文本框添加到JPanel面板
		panel.add(btn);                    // 将按钮添加到JPanel面板
		// 4、向JFrame聊天窗口的顶部和尾部分别加入面板组件JScrollPane和JPanel
		f.add(scrollPane, BorderLayout.PAGE_START);
		f.add(panel, BorderLayout.PAGE_END);
	}
	public static void main(String[] args) {
		// 使用SwingUtilities工具类调用createAndShowGUI()方法并显示GUI程序
		SwingUtilities.invokeLater(Example11::createAndShowGUI);
	}
}

