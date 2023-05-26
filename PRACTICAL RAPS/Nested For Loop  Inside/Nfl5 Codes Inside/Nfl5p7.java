
import java.io.*;
class Raptor{

	public static void main(String [] args)throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Number of rows");

		int row = Integer.parseInt(br.readLine());

		int num = (row*row + row)/2;

		char ch = (char)(64 + num);

		for(int i = 1; i<=row; i++){
			if(row%2 != 0){ 
				for(int j = 1; j<=i; j++){
					if(i%2 != 0){
						System.out.print(ch+ " ");
					}
					else{
						System.out.print(num+ " ");
					}
					ch--;
					num--;
				}
				System.out.println();
			}
			else{
				for(int j = 1; j<=i; j++){
					if(i%2 != 0){
						System.out.print(num+ " ");
					}
					else{
						System.out.print(ch+ " ");
					}
					ch--;
					num--;
				}
				System.out.println();
			}
		}

	}
}
