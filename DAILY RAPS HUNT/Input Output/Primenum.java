
import java.io.*;
class Raptor{
	
	static void Primenum(int a){
	
		int count = 0;
		for(int i = 1; i<=a; i++){
			if(a % i == 0){
				count++;
			}
		} 
		if(count==2)
			 System.out.println("Prime Number");
		else
			System.out.println("Not a Prime Number");
	} 
	public static void main(String [] args)throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Number");
		int a = Integer.parseInt(br.readLine());
		Primenum(a);
	}
}
