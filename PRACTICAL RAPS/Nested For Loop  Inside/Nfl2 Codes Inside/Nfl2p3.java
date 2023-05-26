
/*
14 15 16 17
15 16 17 18
16 17 18 19
17 18 19 20
*/

class Raptor{

        public static void main(String [] args){

                int n = 4;
                for(int i = 1; i<=4; i++){
			int temp = 14+i-1;
                        for(int j = 1; j<=4; j++){
                                System.out.print(temp++ +" ");
                        }
                        System.out.println();
			
                }
        }
}

