
import java.io.*;
class Raptor{

	public static void main(String [] args)throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		System.out.println("Enter Start number :");
		int start = Integer.parseInt(br.readLine());

		System.out.println("Enter Last number : ");
		int last = Integer.parseInt(br.readLine());

		for(int i = start; i<=last; i++){
		
			int count = 0;
			for(int j= 1; j<=i; j++){
				if(i%j==0){
					count++;
				}
			}
			if(count==2){
				System.out.print(i+ " ");
			}
		}
	}
}
