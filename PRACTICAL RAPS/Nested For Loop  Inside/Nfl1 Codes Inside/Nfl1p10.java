
/*
1 2 3 4
2 3 4 5
3 4 5 6
4 5 6 7
*/

class Raptor{

        public static void main(String [] args){

                int n = 4;
                for(int i = 1; i<=4; i++){
			int temp = i;
                        for(int j = 1; j<=4; j++){
                                System.out.print((temp++) + " ");
                        }
                        System.out.println();
                }
        }
}

