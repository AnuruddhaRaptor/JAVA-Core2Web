
import java.io.*;
class Raptor{
	
	public static void main(String [] args)throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Number of Rows");
		
		int row = Integer.parseInt(br.readLine());

		int a = 1;
		int b = 1;
		
		for(int i = 1; i<=row; i++){
		
			for(int j = 1; j<=i; j++){
				a = b-a;
				b = a+b;
				System.out.print(a+ " ");
			}
			System.out.println();
		}
	}
}
