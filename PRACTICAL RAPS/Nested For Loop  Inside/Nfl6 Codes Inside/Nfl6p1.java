
// Wap to print the numbers divisible by 5 from 1 to 50 & the numbers is even also print the count of even numbers.

import java.io.*;

class Raptor{
	
	public static void main(String [] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Start : ");
		int start = Integer.parseInt(br.readLine());

		System.out.println("Enter End : ");
		int end = Integer.parseInt(br.readLine());

		int count = 0;

		System.out.println();

		for(int i = start; i<=end; i++){
			if(i % 5 == 0 && i % 2 == 0){
				count++;
				System.out.println(i +" ");
			}
		}
		System.out.println("Count = " + count);
	}
}
