import java.io.*;
public class Round05_Ex13 {
	public static void main(String[] ar) throws IOException{
		BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
		
		
		System.out.print("��������ڸ� �Է��ϼ���");
		String str=in.readLine();
		System.out.print(str);
		String str1= str== "=" ? "�� ��� ������ �Դϴ�." : "�� ��� �����ڰ� �ƴմϴ�.";
		System.out.println(str1);
		
	}
}
