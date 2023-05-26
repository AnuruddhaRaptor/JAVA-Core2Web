
import java.io.*;
class Raptor{
	
	public static void main(String [] args)throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum = 0;
		System.out.println("Enter number : ");
		int num = Integer.parseInt(br.readLine());

		for(int i = num; i!=0; i=i/10){
			int rem = i%10;
			int fact = 1;
			for(int j = 1; j<=rem; j++){
				fact = fact*j;
			}
			sum = sum + fact;
		}
		System.out.println("Addition of factorial of each digit from "+ num+ " = "+sum);
	}	
}
