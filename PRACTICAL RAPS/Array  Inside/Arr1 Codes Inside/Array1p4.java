
import java.io.*;

class Raptor{

        public static void main(String [] args)throws IOException{

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Enter Array Size : ");
                int size = Integer.parseInt(br.readLine());

		char arr[] = new char[size];

                System.out.println("Enter Elements : ");
		
		for(int i = 0; i<arr.length; i++){
			arr[i] = (char)br.read();
			br.skip(1);
		}

                for(int i = 0; i<arr.length; i++){

                                if(arr[i]=='a' || arr[i]=='e' || arr[i]=='i' || arr[i]=='o' || arr[i]=='u' || arr[i]=='A' || arr[i]=='E' || arr[i]=='I' || arr[i]=='O' || arr[i]=='U'){
                 			System.out.println("Vowels from the given array are : "+ arr[i]); 
                                }
                }
                                
        }
}


