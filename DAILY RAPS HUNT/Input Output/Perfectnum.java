
import java.io.*;
class Raptor{

	public static void main(String [] args)throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter number");
		int num = Integer.parseInt(br.readLine());

		int sum = 0;
		
		for(int i = 1; i<num; i++){
			if(num % i==0){
				sum = sum + i;
			}
		} 
		System.out.println(sum);

		if(sum==num){
			System.out.println("It is Perfect Number");
		} 
		else{
			System.out.println("It is not a Perfect Number");
		}
	}
}
