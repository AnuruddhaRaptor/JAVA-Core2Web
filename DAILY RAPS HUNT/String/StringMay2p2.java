

class Raptor{

        public static void main(String [] args){

                String str1 = "Anuruddha";
                String str2 = "Gawai";

                System.out.println(str1 + str2);

                String str3 = "AnuruddhaGawai";
                String str4 = str1 + str2;

                System.out.println(System.identityHashCode(str3));
                System.out.println(System.identityHashCode(str4));

        }
}

