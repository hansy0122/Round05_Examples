import java.io.*;

public class Round05_Ex11 {
	public static void main(String[] ar) throws IOException {
		BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
		System.out.print("���ڸ� 1 ���ڸ� 2�� �Է��ϼ��� :");
		int a = Integer.parseInt(in.readLine());
				
		String str = a==1 ? "����" : "����";
		System.out.println(str);
		
		//String str1="";
		// a==1 ? str1="����" : str1="����";
	}
}


// �������� ���� String str=""
			// a==1 ? str="����" : str="����"