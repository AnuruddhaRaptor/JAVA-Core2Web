
/*
F   5   D   3   B   1
F   5   D   3   B   1
F   5   D   3   B   1
F   5   D   3   B   1
F   5   D   3   B   1
F   5   D   3   B   1
*/

class Raptor{

        public static void main(String [] args){

                int rows = 6;
                for(int i = 1; i<=6; i++){

                        int x = rows;
                        int ch = 64 + rows;

                                for(int j = 1; j<=rows; j++){
					if(j % 2 == 1){
                                        	System.out.print((char)ch +" ");
					} 
					else{
						System.out.print(x +" ");
					}
                                        ch--;
                                        x--;
                        }
                        System.out.println();
                }
        }
}

