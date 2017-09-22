package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Quiz1_1 {

	public int[] gcdlcm(int a, int b) {
        int[] answer =new int[2];
        
        answer[0] = yacsu(a,b);
        int i = besu(a,b);
        
        int x = a/answer[0];
        int y = b/answer[0];
        System.out.println("x는 : " +x);
        System.out.println("y는 : " +y);
        int toto = x*y*answer[0];
        int kk = a*b/answer[0];
        System.out.println("kk는 : "+kk);
        int con = answer[0]*answer[0]*x*y;
        System.out.println("toto는 : " +toto);
        System.out.println("con은 : "+con);
        answer[1] =toto;
        
        if(a*b/answer[0]==x*y*answer[0]){
        	System.out.println("소름;");
        }
        
        
        
        
        return answer;
    }

    private int besu(int a, int b) {
 
    	return 0;
	}

	private int yacsu(int a, int b) {
		{ //재귀 함수형
    	    if( a % b == 0 )
    	        return b;
    	    else
    	        return yacsu(b, a % b);
    	}
	}

	// 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void main(String[] args) {
    	Quiz1_1 c = new Quiz1_1();
        System.out.println(Arrays.toString(c.gcdlcm(192	, 68)));
    }

}
