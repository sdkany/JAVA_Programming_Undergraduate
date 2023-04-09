package chapter02;
public class Example18 {
	public static void main(String[] args) {
		// 1、第一种方式定义数组
		int[] ids = new int[100];	
		System.out.println("ids[0]="+ids[0]);   //访问数组第一个元素
		System.out.println("ids[99]="+ids[99]); //访问数组最后一个元素
		System.out.println("==============");
		// 2、第二种方式定义数组
		String[] names = new String[]{"张三","tom","jack"};  
		System.out.println("names[0]="+names[0]);     //访问数组第一个元素
		System.out.println("names[2]="+names[2]);     //访问数组最后一个元素
		System.out.println("==============");
		// 3、第三种方式定义数组
		Object[] object = {"张三","tom","jack"};  
		System.out.println("数组的长度为："+object.length);//获取数组的长度
		System.out.println("object[0]="+object[0]);   //访问数组第一个元素
		System.out.println("object[2]="+object[2]);   //访问数组最后一个元素
	}
}


