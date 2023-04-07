package chapter05;
class Test {
	public void finalize () {
		System.out.println("该对象" + this.hashCode() + "已被回收！");
	}
}

public class Time {
	public static void main(String[] args) {
		Test test1 = new Test();
		Test test2 = new Test();
		
		System.out.println("test1 = " + test1.hashCode());
		System.out.println("test2 = " + test2.hashCode());
		
		test1 = null;
		test2 = null;
		System.gc();
	}
}
