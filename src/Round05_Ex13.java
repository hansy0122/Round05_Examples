import java.io.*;
public class Round05_Ex13 {
	public static void main(String[] ar) throws IOException{
		BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
		
		
		System.out.print("산술연산자를 입력하세요");
		String str=in.readLine();
		System.out.print(str);
		String str1= str== "=" ? "는 산술 연산자 입니다." : "는 산술 연산자가 아닙니다.";
		System.out.println(str1);
		
	}
}
