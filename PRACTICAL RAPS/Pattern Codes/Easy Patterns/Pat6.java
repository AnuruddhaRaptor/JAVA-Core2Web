
class Raptor{

	public static void main(String[] args){
	
		int n = 4;
		for(int i = 1; i<=n; i++){
			
			char ch = 'A';

				for(int j = 1; j<=n-i+1; j++){
				
					System.out.print(ch+ " ");
					ch++;
				} 
				System.out.println();
		}
	}
}

//	A  B  C  D
//	A  B  C
//	A  B  
//	A
