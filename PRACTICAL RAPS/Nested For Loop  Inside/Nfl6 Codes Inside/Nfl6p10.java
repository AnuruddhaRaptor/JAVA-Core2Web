
// Wap to to take a range as input from the user and print the Armstrong numbers.

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
			                  int num = i;
			                  int sum = 0;
			                  int count = 0;
			                  while(num != 0){
				                      count++;
				                      num = num / 10;
		                	  }
			                  num = i;

                        while(num != 0){
				                      int mult = 1;
				                      int rem = num % 10;
				                      for(int j = 1; j<=count; j++){
					                            mult = mult*rem;
				                      }
				                      sum = sum + mult;
				                      num = num / 10;
			                  }
			                  if(sum == i)
		        	                System.out.println(i);
                }
        }
}

