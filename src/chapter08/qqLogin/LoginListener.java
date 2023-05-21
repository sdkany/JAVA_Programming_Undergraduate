package chapter08.qqLogin;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

// QQ登录监听器
public class LoginListener implements ActionListener {
	private JComboBox<Object> jco; // 用来获取QQ账号的对象
	private JPasswordField jpa; // 用来获取QQ密码的对象
	private JFrame jf;
	public LoginListener(JComboBox<Object> jco, JPasswordField jpa, JFrame jf) {
		super();
		this.jco = jco;
		this.jpa = jpa;
		this.jf = jf;
	}
	/**
	 * 为登录动作监听事件执行处理
	 */
	public void actionPerformed(ActionEvent e) {
		// 1、获取登录的账号和密码
		String name = (String) jco.getSelectedItem();
		String pwd = new String(jpa.getPassword());
		// 2、判断输入的账号和密码是否正确
		if (name.equals("123456789") && pwd.equals("123")) {
			// 账号正确，先关闭当前JFrame登录窗口
			jf.dispose();
			// 模拟显示登录成功后的QQ窗口
			JFrame jfn = new JFrame();
			jfn.setSize(289, 687);
			jfn.setLocation(800, 100);
			jfn.setUndecorated(true);
			jfn.setResizable(true);
			jfn.setVisible(true);
			// 为QQ显示窗口添加背景图片和退出按钮组件
			JPanel panel = new JPanel();
			panel.setLayout(null);
			panel.setPreferredSize(new Dimension(0, 140));
			ImageIcon image = new ImageIcon("images/qqSuccess.jpg");
			JLabel background = new JLabel(image);
			background.setBounds(0, 0, 289, 687);
			panel.add(background);
			// 添加退出按钮
			JButton out = new JButton(
					new ImageIcon("images/close2_normal.jpg"));
			out.setBounds(265, 0, 26, 26);
			out.setRolloverIcon(new ImageIcon("images/close2_hover.jpg"));
			out.setBorderPainted(false);
			panel.add(out);
			jfn.add(panel);
			// 为退出按钮注册监听器，关闭当前窗口
			out.addActionListener(event -> jfn.dispose());
		} else {
			// QQ账号或密码输入错误，弹出提示信息
			JOptionPane.showMessageDialog(null,
					"你输入的账户名或密码不正确，请重新输入！");
		}
	}
}