package chapter11;
import java.io.*;
import java.net.*;
// TCP客户端
public class TCPClient {
	public static void main(String[] args) throws Exception {
		// 创建一个Socket并连接到指定的服务器端
		Socket client = new Socket(InetAddress.getLocalHost(),7788);
		// 获取服务端返回的输入流数据并打印
		InputStream is = client.getInputStream(); 
		byte[] buf = new byte[1024]; 
		int len = is.read(buf);
		while (len != -1){
			System.out.println(new String(buf, 0, len)); 
			len = is.read(buf);
		}
		// 关闭流和Socket连接
		is.close();
		client.close(); // 关闭Socket对象,释放资源
	}
}
