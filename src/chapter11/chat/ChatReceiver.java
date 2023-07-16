package chapter11.chat;
import java.net.*;
/**
 * 聊天程序信息接收端
 */
public class ChatReceiver implements Runnable {
	// 聊天程序收发平台DatagramSocket对象
	private DatagramSocket server;
	public ChatReceiver(DatagramSocket server) {
		this.server = server;
	}
	public void run() {
		try {
			// 创建DatagramPacket数据包接收对象
			byte[] buf = new byte[1024];
			DatagramPacket packet = new DatagramPacket(buf, buf.length);
			while (true) {
				server.receive(packet);
				// 显示并打印聊天信息
				String str = new String(packet.getData(), 
								0, packet.getLength());
				System.out.println("收到" + packet.getAddress()
						+":"+packet.getPort()+ " 发送的数据:" + str);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}