
/*
1
8   27
64  125  216
*/

class Raptor{

        public static void main(String [] args){

                int row = 3;
		int x = 1;
                for(int i = 1; i<=row; i++){
                        for(int j = 1; j<=i; j++){
                                System.out.print(x*x*x +" ");
				x++;

                        }
                        System.out.println();
                }
        }
}
