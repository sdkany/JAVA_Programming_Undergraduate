package chapter05;
public class Example14 {
	public static void main(String[] args) throws Exception {
        // 创建一个Runtime实例对象
		Runtime rt = Runtime.getRuntime();
		// 得到表示进程的Process对象
		Process process = rt.exec("notepad.exe");
		// 程序休眠3秒
		Thread.sleep(3000); 
		// 关闭进程
		process.destroy();
	}
}

