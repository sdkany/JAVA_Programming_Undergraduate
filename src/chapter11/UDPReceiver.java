package chapter11;
import java.net.*;
//接收端程序
public class UDPReceiver {
	public static void main(String[] args) throws Exception {
		// 定义一个指定端口号为8900的接收端DatagramSocket对象
		DatagramSocket server = new DatagramSocket(8900);
		// 定义一个长度为1024的字节数组，用于接收数据
		byte[] buf = new byte[1024];
		// 定义一个DatagramPacket数据报对象，用于封装接收的数据
		DatagramPacket packet = new DatagramPacket(buf, buf.length);
		System.out.println("等待接收数据...");
		while (true){
			// 等待接收数据报数据，在没有接收到数据之前会处于阻塞状态
			server.receive(packet); 
			// 调用DatagramPacket的方法获得接收到的信息,并转换为字符串形式
			String str = new String(packet.getData(), 
                                       0, packet.getLength());
			System.out.println(packet.getAddress()+ ":" 
									+ packet.getPort()+"发送消息："+str);
		}
	}
}

