
import java.io.*;
class Raptor{

	static void Strongnum(int a){
	
		int sum = 0;
		int temp = a;
		int rem = 0;

			while(a!=0){
			        rem = a % 10;
		        	int fact = 1;
					for(int i = 1; i<=rem; i++){
						fact = fact*i;
				        }
				        sum = sum + fact;
			         	a = a/10;
			}

			if(sum == temp){
				System.out.println("Strong Number");
			}
			else{
				System.out.println("Not a Strong Number");
			}
	}
	public static void main(String [] args)throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Number");
		int a = Integer.parseInt(br.readLine());
		Strongnum(a);
		
	}
}
