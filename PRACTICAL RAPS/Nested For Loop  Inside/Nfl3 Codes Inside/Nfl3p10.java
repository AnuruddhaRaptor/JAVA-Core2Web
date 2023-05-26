
/*
1  2  3  4
4  5  6
6  7 
7
*/

class Raptor{

        public static void main(String [] args){

                int row = 4;
		int x = 1;
                for(int i = 1; i<=row; i++){
                        for(int j = 1; j<=row; j++){
                                System.out.print((x++)+" ");

                        }
			x--;
                        System.out.println();
                }
        }
}
