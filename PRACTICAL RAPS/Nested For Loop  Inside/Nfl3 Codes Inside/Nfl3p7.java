

/*
F 
E F 
D E F
C D E F
B C D E F
A B C D E F
*/

class Raptor{

        public static void main(String [] args){

                int row = 6;
                for(int i = 1; i<=row; i++){
			int ch = 65 + row - i;
                        for(int j = 1; j<=i; j++){
                                System.out.print((char)ch +" ");
				ch++;

                        }
                        System.out.println();
                }
        }
}
