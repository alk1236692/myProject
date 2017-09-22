package test;

public class StringtoInteger {

	public static void main(String[] args) {
		String str = "-254";
		System.out.println(convert(str));

	}

	private static int convert(String str) {
		int a =Integer.parseInt(str);
		
		return a;
		
	}
	

}
