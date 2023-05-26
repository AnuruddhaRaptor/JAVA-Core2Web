
import java.io.*;
class Raptor{

	public static void main(String [] args)throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Number of Rows");
		int row = Integer.parseInt(br.readLine());
		int n1 = row, n2= row;
		for(int i = 1; i<=row; i++){
		
			int temp = n2*i;
			
			for(int j = 1; j<=row-i+1; j++){
				System.out.print(temp + " ");
				temp = temp - i;
			}
			n2--;
			System.out.println();
		}
	}
}
