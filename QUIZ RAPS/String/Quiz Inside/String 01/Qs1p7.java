

class Core2Web{

        public static void main(String [] args){

                String s1 = new String ("core2web");
                String s2 = new String ("core2web");

                if(s1 == s2)
                        System.out.println("True 1");

                if(s1.equals(s2))
			System.out.println("True 2");
                
		if(s1.hashCode() == s2.hashCode())
                        System.out.println("True 3");
        }
}

