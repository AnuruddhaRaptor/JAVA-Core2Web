

/*
d d d d 
c c c c 
b b b b
a a a a
*/

class Raptor{

        public static void main(String [] args){

                int n = 4;
		char ch = 'd';
                for(int i = 1; i<=n; i++){
                        for(int j = 1; j<=4; j++){
                                System.out.print(ch + " ");
                        } 
			ch--;
                        System.out.println();
                }
        }
}

