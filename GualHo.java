package test;

import java.util.Stack;
/*	배열내에 두 스트링이 있는지 없는지 확인해줍니다.
 *  이걸로 괄호의 짝이 있는지 없는 확인 합니다.
 * 
 */


public class GualHo {

	public static void main(String[] args) {
		Stack<String> stack= new Stack<String>();
		String gualho = "({[}])";
		String []arr = new String[gualho.length()];
		arr = gualho.split("");
		
		
		
		System.out.println(find(arr,"(",")"));
		System.out.println(find(arr,"{","}"));
		System.out.println(find(arr,"[","]"));
		
		
		
		
		
		

	}

	private static boolean find(String[] arr, String string, String string2) {
		String temp = null;
		String temp2 = null;
		for(int i=0;i<arr.length;i++){
			if(arr[i].equals(string)){
				temp = arr[i];
			}else if(arr[i].equals(string2)){
				temp2 =arr[i];
				break;
			}
		}
		
		if(temp!=null && temp2!=null) return true;
		else return false;
		
	}

}
