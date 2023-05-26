
import java.io.*;

class Raptor{

	public static void main(String [] args)throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Player Name");
		String name1 = br.readLine();

		System.out.println("Enter Jerno");
		int Jerno =Integer.parseInt (br.readLine());

		System.out.println("Enter Avg");
		float avg = Float.parseFloat(br.readLine());

		System.out.println(name1);
		System.out.println(Jerno);
		System.out.println(avg);

	}
}
