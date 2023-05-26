
import java.io.*;
class Raptor{
	
	public static void main(String [] args)throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number of Rows");
		int rows = Integer.parseInt(br.readLine());

		for(int i = 1; i<=rows; i++){
			for(int j = 1; j<=i; j++){
				if(i%4==0){
					System.out.print(" # ");
				}
				else if(i%3==0){
					System.out.print(" & ");
				} 
				else if(i%2==0){
					System.out.print(" @ ");
				}
				else{
					System.out.print(" $ ");
				}
			}
			System.out.println();
		}
	}
}
