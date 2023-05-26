
/*
1C3	4B2	9A1
16C3	25B2	36A1
49C3	64B2	81A1
*/

class Raptor{

        public static void main(String [] args){

                int x = 1;
		int rows = 3;
                for(int i = 1; i<=3; i++){
			
			int num = rows;
		        int ch = 65 + rows-1;	
                        	for(int j = 1; j<=3; j++){
                                	System.out.print(x*x +""+ (char)ch +""+ num +" ");
					num--;
					ch--;
					x++;
                        }
                        System.out.println();
                }
        }
}

