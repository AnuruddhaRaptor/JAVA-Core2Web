
/*
3C 3C 3C 3C
3C 3C 3C
3C 3C 
3C
*/

class Raptor{

        public static void main(String [] args){

                int row = 4;
                for(int i = 1; i<=row; i++){
                        for(int j = 1; j<=4-i+1; j++){
                                System.out.print("3C ");

                        }
                        System.out.println();
                }
        }
}
