public class Chair{
	long carNumber;
	String name;
	int priceOfBook;
	float fruitWeights;
	char rainbowColors;
	
	public Chair()
	{
		System.out.println("It is wooden chair");
		System.out.println(carNumber);
		System.out.println(name);
		System.out.println(priceOfBook);
		System.out.println(fruitWeights);
		System.out.println(rainbowColors);
		
	}
	
	
	public Chair(long carNumber1 , String name1 , int priceOfBook1, float fruitWeights1,char rainbowColors1)
	{
		System.out.println("chair color is brown");
		carNumber = carNumber1;
		name = name1;
		priceOfBook =priceOfBook1;
		fruitWeights = fruitWeights1;
		rainbowColors = rainbowColors1;
		
	}
	
	public static void main(String[] args)
	{
		new Chair();
		System.out.println("**********************");
		Chair chair = new Chair(25486 , "avinash" , 60 , 40.3f , 'b');
		System.out.println(chair.carNumber);
		System.out.println(chair.name);
		System.out.println(chair.priceOfBook);
		System.out.println(chair.fruitWeights);
		System.out.println(chair.rainbowColors);
	}
}