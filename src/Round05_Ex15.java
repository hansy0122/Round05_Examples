import java.io.*;
public class Round05_Ex15 {
 public static void main(String[] ar) throws IOException {
 
	 	char a=(char)System.in.read();
	 	boolean bool= a=='+'|a=='-'|a=='/'|a=='*'|a=='%';
	 	
	 	System.out.print(a+"는 산술연산자"+(bool ? "입니다.":"가 아닙니다."));   //가 아닙니다 입니다
 
 
 }
}
