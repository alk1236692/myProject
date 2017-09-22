package test;

import java.util.*;
 
class Manacher
{
  public static void main(String args[])
  {
    String inputString;
    Scanner in = new Scanner(System.in); 
 
    System.out.println("Input a string");
    inputString = in.nextLine();//문자열을 입력한다.
 
    int length  = inputString.length(); //길이
    int i, begin, end, middle; //i와 처음,중간,끝 선언
 
    begin  = 0;//처음 위치를 정해준다.
    end    = length - 1; //end를 위치를 정해준다.
    middle = (begin + end)/2;//센터위치를 정해준다.
 
    for (i = begin; i <= middle; i++) { //처음부터 센터까지. 반복.
      if (inputString.charAt(begin) == inputString.charAt(end)) {//만약 현재글자와 끝글자가 같다면.
        begin++;//다음 글자를 비교한다.
        end--;
      }
      else {
        break;//그렇지 않으면 브레이크!
      }
    }
    if (i == middle + 1) {//i가 센터+1과 같다면
      System.out.println("Palindrome");//팬린드롬이고
    }
    else {
      System.out.println("Not a palindrome");//그게 아니면 팬린드롬이 아니다.
    }
  }
}
