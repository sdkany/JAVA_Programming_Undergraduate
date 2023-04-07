package chapter05;
public class Example12 {
	public static void main(String[] args) {
		Runtime rt = Runtime.getRuntime(); // 获取Java程序关联的运行时对象
		System.out.println("处理器的个数: " 
		                       + rt.availableProcessors() + "个");
		System.out.println("空闲内存大小: "
		                       + rt.freeMemory() / 1024 / 1024 + "M");
		System.out.println("最大可用内存大小: " 
		                       + rt.maxMemory() / 1024 / 1024 + "M");
	}
}

