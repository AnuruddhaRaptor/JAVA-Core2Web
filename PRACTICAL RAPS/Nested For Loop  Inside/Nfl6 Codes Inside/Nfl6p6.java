
// Wap to to take 5 numbers as input from the user and print the count of all the digits in those numbers.

import java.io.*;

class Raptor{

        public static void main(String [] args) throws IOException{

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                System.out.println("How many numbers you want to enter? ");
                int input = Integer.parseInt(br.readLine());
		            int count = 0;

		            do{

                	    System.out.println("Enter Number : ");
                	    int num = Integer.parseInt(br.readLine());

				              int temp = num;
				              int cnt1 = 0;

				              while(temp != 0){
					                  cnt1++;
					                  temp = temp/10;
				              }
				              System.out.println("Number "+num+" has " +cnt1+" digits");
		                  count++;
                      
		            }while(count != input);
                
        }
}

