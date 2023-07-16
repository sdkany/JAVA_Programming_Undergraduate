package chapter11.chat;
import java.net.*;
import java.util.Scanner;
/**
 * 聊天程序发送信息服务端
 */
public class ChatSend implements Runnable {
	// 聊天程序信息发送平台DatagramSocket对象
	private DatagramSocket client;
	// 聊天对象的程序所在服务端口号
	private int targetPort; 
	public ChatSend(DatagramSocket client,int targetPort) {
		this.client = client;
		this.targetPort = targetPort;
	}
	public void run() {
		try {
			// 输入并获取键盘要发送的聊天信息
			Scanner sc = new Scanner(System.in);
			while (true) {
				String data = sc.nextLine();
				// 封装数据到 DatagramPacket数据包发送对象中
				byte[] buf = data.getBytes();
				DatagramPacket packet = new DatagramPacket(buf, buf.length,
					   InetAddress.getByName("127.0.0.255"),targetPort);
				client.send(packet);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
