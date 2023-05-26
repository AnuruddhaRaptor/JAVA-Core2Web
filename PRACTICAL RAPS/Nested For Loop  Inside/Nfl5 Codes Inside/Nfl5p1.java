
import java.io.*;
class Raptor{

	public static void main(String [] args)throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Number of Rows");
		int row = Integer.parseInt(br.readLine());
			char ch = (char)(65 + row);
			for(int i = 1; i<=row; i++){
				for(int j = 1; j<=4; j++){
					if(i%2 == 0){
						System.out.print((ch++)+" "+(j)+ " ");
					} 
					else{
						System.out.print((ch--)+" "+(5-j)+ " ");
					}
				} 
				System.out.println();
			}
	}
}
