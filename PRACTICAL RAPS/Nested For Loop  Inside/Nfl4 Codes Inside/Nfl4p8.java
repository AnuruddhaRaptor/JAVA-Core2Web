
/*
10
I  H 
7  6  5
D  C  B  A
*/

class Raptor{

        public static void main(String [] args){

                int row = 4;
                char ch = 'J';
                int x = 10;
                for(int i = 1; i<=row; i++){
                    
                        for(int j = 1; j<=i; j++){
                                if(i % 2 == 0){
                                        System.out.print((ch) +" ");
				}	
                                else{
                                        System.out.print((x) +" ");
                                }
				ch--;
				x--;
                        }
                        System.out.println();
                }
        }
}

