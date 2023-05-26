
/*
10 10 10 10
11 11 11
12 12 
13
*/

class Raptor{

        public static void main(String [] args){

                int row = 4;
		int x = 10;
                for(int i = 1; i<=row; i++){
                        for(int j = 1; j<=4-i+1; j++){
                                System.out.print(x+" ");

                        }
			x++;
                        System.out.println();
                }
        }
}
