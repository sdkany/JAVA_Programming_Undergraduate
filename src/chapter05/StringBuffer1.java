package chapter05;

public class StringBuffer1 {

	public static void main(String[] args) {
		StringBuffer stringBuffer = new StringBuffer("String");
		System.out.println(stringBuffer);
		System.out.println(stringBuffer.substring(0, 3));
		System.out.println(stringBuffer.append("_AnotherString"));
		System.out.println(stringBuffer.insert(6, "INSERT"));
		System.out.println(stringBuffer.deleteCharAt(6));
		System.out.println(stringBuffer.deleteCharAt(6));
		System.out.println(stringBuffer.deleteCharAt(6));
		System.out.println(stringBuffer.deleteCharAt(6));
		System.out.println(stringBuffer.deleteCharAt(6));
		System.out.println(stringBuffer.deleteCharAt(6));
		System.out.println(stringBuffer.replace(6, 7, "!!!"));
		
		stringBuffer.setCharAt(6, '_');
		System.out.println(stringBuffer);
		
		StringBuilder stringBuilder = new StringBuilder("String");
	}

}
