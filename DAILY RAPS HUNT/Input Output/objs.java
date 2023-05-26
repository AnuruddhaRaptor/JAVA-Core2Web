
class Raptor{

	void fun(int x){
		int y = x+10;
	} 

	public static void main(String [] args){
	
		Raptor obj = new Raptor();
		int a = obj.fun(10);
		System.out.println(a);
	}
}
