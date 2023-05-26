
// Wap to to take a range as input fro the user and print perfect squares between that range.

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
			                for(int j = 1; j*j<=i; j++){
			
                        	if(j*j == i)
                                
                                	System.out.println(i +" ");
                        }
                }
               
        }
}

