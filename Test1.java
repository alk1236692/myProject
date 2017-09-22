package test;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a,b = 0;
		a = scan.nextInt();
		b = scan.nextInt();
		
		if(a>0 & b<10)System.out.print(a+b);
		else System.out.println("a>0 & b<10이 아닙니다.");
		scan.close();
	}
}
