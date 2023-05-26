
import java.io.*;

class Raptor{

        public static void main(String [] args)throws IOException{

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Enter Array Size : ");
                int size = Integer.parseInt(br.readLine());

                int arr[] = new int[size];

                System.out.println("Enter Elements : ");

                int mult = 1;

                for(int i = 0; i<arr.length; i++){
                        arr[i] = Integer.parseInt(br.readLine());
                                if(i%2 != 0){
                                        mult = mult *  arr[i];
                                }
                }
                System.out.println("Product of Odd Index : "+ mult);
        }
}

