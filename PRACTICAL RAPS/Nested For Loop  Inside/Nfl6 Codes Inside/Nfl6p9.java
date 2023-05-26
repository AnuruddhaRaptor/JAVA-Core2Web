
// Wap to to print series of strong numbers from entered range.

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
                        while(num != 0){
				                      int rem = num % 10;
				                      int fact = 1;
				                      for(int j = 1; j<=rem; j++)
					                            fact = fact*j;
					                            sum = sum + fact;
					                            num = num / 10;
				
			                  }
			                  if(sum == i)
		                          System.out.println(i);
                }
        }
}

