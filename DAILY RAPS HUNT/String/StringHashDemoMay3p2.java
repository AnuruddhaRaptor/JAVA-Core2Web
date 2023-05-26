
class Raptor{

	public static void main(String [] args){
	
		String str1 = "Anuruddha";
		String str2 = new String("Anuruddha");
		String str3 = "Anuruddha";
		String str4 = new String("Anuruddha");

		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());
	}
}
