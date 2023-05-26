
import java.util.*;
import java.io.*;

class Raptor{

	public static void main(String [] args) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("-----------------------------------------------------");

		System.out.println("NOTE : USE COMMA (,) FOR SEPARATION");
		System.out.println("ENTER STUDENT'S NAME , DIVISION , ROLL NO , PERCENTAGE");
		System.out.println("-----------------------------------------------------");
		String info = br.readLine();

		System.out.println("-----------------------------------------------------");

		System.out.println(info);
		System.out.println("YOUR INPUT VALUES HAS BEEN CONVERTED INTO PROPER FORMAT SUCCESSFULLY.");
		System.out.println("PRESS ENTER TO SEE");

		System.out.println("-----------------------------------------------------");

		StringTokenizer obj = new StringTokenizer(info, ",");

		String token1 = obj.nextToken();
		
		String token2 = obj.nextToken();	
		char ch = token2.charAt(0);
		br.skip(1);

		int token3 = Integer.parseInt(obj.nextToken());

		float token4 = Float.parseFloat(obj.nextToken());
	

		System.out.println("-----------------------------------------------------");
		System.out.println("Student's Name = " +token1);
		System.out.println("Division       = " +token2);
		System.out.println("Roll No        = " +token3);
		System.out.println("Percentage     = " +token4);
		System.out.println("-----------------------------------------------------");

		System.out.println("-----------------------------------------------------");
	}
}
