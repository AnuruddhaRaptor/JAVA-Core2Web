
import java.io.*;
class Raptor{

	public static void main(String [] args)throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter number");

	        int number =Integer.parseInt(br.readLine());

		int rev = 0;
		int rem = 0;
		
		while(number!=0){
		
			rem = number%10;
			rev = rev*10 + rem;
			number = number/10;
		} 
		System.out.println(rev);
	}
}
