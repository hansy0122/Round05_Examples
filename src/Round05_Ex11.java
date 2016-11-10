import java.io.*;

public class Round05_Ex11 {
	public static void main(String[] ar) throws IOException {
		BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
		System.out.print("남자면 1 여자면 2를 입력하세요 :");
		int a = Integer.parseInt(in.readLine());
				
		String str = a==1 ? "남성" : "여성";
		System.out.println(str);
		
		//String str1="";
		// a==1 ? str1="남성" : str1="여성";
	}
}


// 오류나는 구문 String str=""
			// a==1 ? str="남성" : str="여성"