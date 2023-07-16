package chapter11;
import java.io.*;
import java.net.*;
// TCP服务端
public class ThreadTCPServer {
	public static void main(String[] args) throws Exception {
		// 创建一个指定端口号为7788的服务器端ServerSocket对象
		ServerSocket serverSocket = new ServerSocket(7788);
		// 使用while循环不停的接收客户端发送的请求
		while (true) {
			// 调用ServerSocket的accept()方法与客户端建立连接
			Socket client = serverSocket.accept();
			// 针对每一个客户端请求创建一个线程进行连接管理
			Thread thread = new Thread(() -> {
				try {
					// 获取当前连接的客户端所在端口号
					int port =client.getPort();
					System.out.println("与端口号为"+port+"的客户端连接成功！");
					OutputStream os = client.getOutputStream();
					os.write(("服务器端向客户端做出响应！").getBytes());
					Thread.sleep(5000); 
					System.out.println("结束与客户端数据交互");
					// 关闭流和Socket连接
					os.close(); 
					client.close(); 
				} catch (Exception e) {
					e.printStackTrace();
				}
			});
			// 执行线程类，与客户端进行数据交互
			thread.start();
		}
	}
}
