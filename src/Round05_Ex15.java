import java.io.*;
public class Round05_Ex15 {
 public static void main(String[] ar) throws IOException {
 
	 	char a=(char)System.in.read();
	 	boolean bool= a=='+'|a=='-'|a=='/'|a=='*'|a=='%';
	 	
	 	System.out.print(a+"�� ���������"+(bool ? "�Դϴ�.":"�� �ƴմϴ�."));   //�� �ƴմϴ� �Դϴ�
 
 
 }
}
