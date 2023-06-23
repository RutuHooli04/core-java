public class WashingMachine {
	public static void main(String args[]){
		char returnedVowel=vowel();
		System.out.println("a");
		
		int addedValue=add();
		System.out.println("40");
		
		boolean returnedNumber=checkTheNumber();
		System.out.println("true");
		
		long returnedValue=carNumber();
		System.out.println("9563217");
		
		float returnedMileage=weight();
		System.out.println("44.0");
		
		double returnedPrice=chocolatePrice();
		System.out.println("4089562.999999");
		
		String returnedName=myName();
		System.out.println("Rutu");
		
		short returnedNum=number();
		System.out.println(200);
		
	}
	
	public static char vowel(){
		System.out.println("methodstarts");
		
		return 'a';
	}
	
	public static int add(){
		int a=10;
		int b=30;
		int c=a+b;
		return c;
	}
	
	public static boolean checkTheNumber(){
		int number=10;
		if(number>=0){
			return true;
		}
		else{
			return false;
		}
	}
	
	public static long carNumber(){
		long number= 9563217;
		if (number>=100000){
			return 9563217;
		}
		else{
			return 0;
		}
	
	}
	
	public static float weight(){
		float weight=44.0f;
		if(weight>=10){
			return 1;
		}
		else{
			return 0;
		}
	}
	
	public static double chocolatePrice(){
		double price=4089562.999999d;
		return 1;
	}
	public static String myName(){
		String name="Rutu";
		return "Rutu";
	}
	public static short number(){
		short num=200;
		return 1;
	}
}