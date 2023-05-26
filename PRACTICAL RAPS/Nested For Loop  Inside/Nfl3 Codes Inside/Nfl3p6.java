
/*
9 
9 8
9 8 7
9 8 7 6
*/

class Raptor{

        public static void main(String [] args){

                int row = 4;
                for(int i = 1; i<=row; i++){
			int x = 9;
                        for(int j = 1; j<=i; j++){
                                System.out.print((x--)+" ");

                        }
                        System.out.println();
                }
        }
}
