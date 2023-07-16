package chapter11.upload;
import java.io.*;
import java.net.*;
// 服务端线程管理类，用于处理客户端图片上传
class ServerThread implements Runnable {
	private Socket socket;                 
	public ServerThread(Socket socket) { 
		this.socket = socket;
	}
	public void run() {
		// 1、处理客户端请求，进行上传文件保存
		String ip = socket.getInetAddress().getHostAddress();
		int count = 1;                                                
		try {
			// 创建图片上传保存目录
			File parentFile = new File("D:\\upload\\");   
			if (!parentFile.exists()) {                      
				parentFile.mkdir();
			}
			// 把客户端的IP地址作为上传文件的文件名
			File file = new File(parentFile, ip + "(" + count + ").jpg");
			while  (file.exists()) {
				file = new File(parentFile, ip + "(" + (count++) + ").jpg");
			}
			// 通过客户端输入流读取上传图片写入到指定目录
			InputStream in = socket.getInputStream();
			FileOutputStream fos = new FileOutputStream(file); 
			byte[] buf = new byte[1024]; 
			int len = 0; 
			while ((len = in.read(buf)) != -1) { 
				fos.write(buf, 0, len);  
			}
			// 2、服务器端向客户端做出响应，返回信息
			OutputStream out = socket.getOutputStream();
			out.write("上传成功".getBytes());  
			// 关闭流和Socket连接
			in.close();
			fos.close();  
			socket.close(); 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
// TCP网络通信服务端
public class UploadTCPServer {
	public static void main(String[] args) throws Exception {
		// 创建指定端口号为10001的服务端ServerSocket对象
		ServerSocket serverSocket = new ServerSocket(10001);  
		while (true) {  
              // 调用accept()方法持续接收客户端请求
			Socket client = serverSocket.accept();	
			// 针对每一个客户端请求创建一个线程进行连接管理
			new Thread(new ServerThread(client)).start();
		}
	}
}

