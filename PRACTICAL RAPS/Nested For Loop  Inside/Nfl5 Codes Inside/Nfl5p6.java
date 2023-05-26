
import java.io.*;
class Raptor{

	public static void main(String [] args)throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter 1st Character");

		int ch1 = br.read();

		br.skip(1);

		System.out.println("Enter 2nd Character");

		int ch2 = br.read();

		if(ch1 == ch2){
		
			System.out.println(" Character " + (char)(ch1) + " and " + (char)(ch2) + " are same. ");

		}
		else if(ch1<ch2){
			int ans = ch2-ch1;
			System.out.println("Difference between " + (char)(ch1) + " and " + (char)(ch2) + " is " + ans);
		} 

	}
}
