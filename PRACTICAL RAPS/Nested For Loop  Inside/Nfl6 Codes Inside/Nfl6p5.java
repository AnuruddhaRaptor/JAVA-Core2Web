
// Wap to to take a range as input fro the user and print perfect numbers.

import java.io.*;

class Raptor{

        public static void main(String [] args) throws IOException{

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Enter Start : ");
                int start = Integer.parseInt(br.readLine());

                System.out.println("Enter End : ");
                int end = Integer.parseInt(br.readLine());


                System.out.println();

                for(int i = start; i<=end; i++){
			                  int sum = 0;
                        for(int j = 1; j<i; j++){

                                if(i%j == 0){
					                            sum = sum + j;
				                        }
                        }
			                  if(sum == i){
			                        	System.out.println(i +" ");
			                  }
                }

        }
}

