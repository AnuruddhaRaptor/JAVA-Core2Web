
import java.io.*;

class Raptor{

        public static void main(String [] args)throws IOException{

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                int arr[] = new int[10];

                System.out.println("Enter Elements : ");

		for(int i = 0; i<arr.length; i++){
			arr[i] = Integer.parseInt(br.readLine());
		}

                for(int i = 0; i<arr.length; i++){
                                if(arr[i]%5 == 0){
                         		System.out.println("Elements divisible by 5 are : "+ arr[i]);           
                                }
                }
        }
}

