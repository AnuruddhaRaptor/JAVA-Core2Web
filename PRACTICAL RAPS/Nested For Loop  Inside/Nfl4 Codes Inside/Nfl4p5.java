
/*
A  B  C  D
B  C  D 
C  D  
D
*/

class Raptor{

        public static void main(String [] args){

                int row = 4;
             
                for(int i = 1; i<=row; i++){
			char ch = (char)(64 + i);
                        for(int j = 1; j<=row-i+1; j++){
                                System.out.print((ch++) +" ");

                        }
                        System.out.println();
                }
        }
}

