package chapter08.qqLogin;
import java.awt.*;
import javax.swing.*;
// QQ登录主界面初始化类
public class QQLogin {
	// 1、为QQ登录界面整体初始化一个JFrame窗口
	private static JFrame jf = new JFrame();
	// QQ登录窗口初始化方法
	public static void initLogin() {
		jf.setSize(426, 300);     // 设置窗口尺寸
		jf.setLocation(497, 242); // 设置窗口在屏幕显示位置
		jf.setUndecorated(true);  // 设置JFrame窗口边框不显示
		jf.setResizable(false);   // 禁止改变窗口大小
		// 2、根据QQ登录界面效果，进行布局分配
		BorderLayout border_layout = new BorderLayout();
		jf.setLayout(border_layout);
		// 2.1、创建并加入顶部面板
		JPanel panel_north = CreatePanel.CreateNorthPanel(jf);
		jf.add(panel_north, BorderLayout.PAGE_START);
		// 2.2、创建并加入中部面板
		JPanel panel_center = CreatePanel.CrateCenterPanel(jf);
		jf.add(panel_center, BorderLayout.CENTER);
		// 2.3、创建并加入左侧面板
		JPanel panel_west = CreatePanel.CreateWestPanel();
		jf.add(panel_west, BorderLayout.LINE_START);
		// 2.4、创建并加入底部面板
		JPanel panel_south = CreatePanel.CreateSouthPanel();
		jf.add(panel_south, BorderLayout.PAGE_END);
		// 2.5、创建并加入右侧面板
		JPanel pannel_east = CreatePanel.CrateEastPanel();
		jf.add(pannel_east, BorderLayout.LINE_END);
		jf.setVisible(true);    // 设置窗口可见
	}
	// QQ登录程序入口
	public static void main(String[] args) {
		// 使用SwingUtilities工具类调用createAndShowGUI()方法并显示GUI程序
		SwingUtilities.invokeLater(QQLogin::initLogin);
	}

}