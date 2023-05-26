
import java.io.*;
class Raptor{

	public static void main(String [] args)throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Start Number");
		int start = Integer.parseInt(br.readLine());

		System.out.println("Enter End Number");
		int end = Integer.parseInt(br.readLine());

		for(int i = end; i>=start; i--){
			if(i%2==0){
				System.out.print(i+ " ");
			}
		}
		System.out.println();

		for(int j = start; j<=end;j++){
			if(j%2==0){
				System.out.print(j+ " ");
			}
		}
		System.out.println();
	}	

}
