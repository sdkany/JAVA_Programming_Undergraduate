package chapter11.chat;
import java.net.*;
import java.util.Scanner;
// 聊天程序入口
public class ChatRoom {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入聊天服务当前启动端口号：");
		int serverPort = sc.nextInt();
		System.out.print("请输入聊天服务发送信息对象的目标端口号：");
		int targetPort = sc.nextInt();
		System.out.println("聊天系统初始化完成并启动！！！");	
		try {
			// 创建聊天程序收发平台DatagramSocket对象
			DatagramSocket socket = new DatagramSocket(serverPort);
			// 分别启动信息接收端和发送端程序
		    new Thread(new ChatReceiver(socket), "接收服务").start();
		    new Thread(new ChatSend(socket,targetPort),"发送服务").start();
		} catch (SocketException e) {
			e.printStackTrace();
		}
	}
}
