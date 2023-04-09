package chapter02;
public class Example19 {
	public static void main(String[] args) {
		// 1、第一种方式定义数组
		int[] ids = new int[100];	
		System.out.println("ids[0]="+ids[0]);  //访问数组第一个元素
		// 为数组指定元素进行初始化赋值
		ids[0] = 2500;
		System.out.println("ids[0]="+ids[0]);  //再次访问数组第一个元素
		System.out.println("==============");
		// 2、第二种方式定义数组
		String[] names = new String[]{"张三","tom","jack"};  
		System.out.println("names[0]="+names[0]);   //访问数组第一个元素
		// 为数组定义时指定的初始值进行修改
		names[0] = "李四";
		System.out.println("names[0]="+names[0]);   //再次访问数组第一个元素
		System.out.println("==============");
		// 3、第三种方式定义数组
		Object[] object = {"张三","tom","jack"};  
		System.out.println("object[0]="+object[0]); //访问数组第一个元素
		// 为数组定义时指定的初始值进行修改
		object[0] = "李四";
		System.out.println("object[0]="+object[0]); //再次访问数组第一个元素
	}
}


