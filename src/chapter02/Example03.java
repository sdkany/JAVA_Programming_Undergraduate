package chapter02;
public class Example03 {
	public static void main(String[] args) {
		byte b =3;
		short s =4;
		char c =5;  
		//将byte、short、char类型数值相加，再赋值给byte类型
//		byte b2 = b+s+c;  
		byte b2 = (byte) (b+s+c);
         System.out.println("b2=" + b2);
	}
}


