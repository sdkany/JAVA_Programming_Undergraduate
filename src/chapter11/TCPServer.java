package chapter11;
import java.io.*;
import java.net.*;
// TCP服务端
public class TCPServer {
	public static void main(String[] args) throws Exception {
		// 创建指定端口号为7788的服务端ServerSocket对象
		ServerSocket serverSocket = new ServerSocket(7788); 
		while (true){
			// 调用ServerSocket的accept()方法开始接收数据
			Socket client = serverSocket.accept(); 
			System.out.println("与客户端连接成功，开始进行数据交互！");
			// 获取客户端的输出流对象
			OutputStream os = client.getOutputStream();
			// 当客户端连接到服务端时，向客户端输出数据
			os.write(("服务器端向客户端发送信息！" + Math.random()).getBytes());
			// 模拟与客户端交互耗时
			Thread.sleep(5000);
			// 关闭流和Socket连接
			os.close();
			client.close();
		}
	}
}
