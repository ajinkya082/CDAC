package dessert;

import food_item.Fruit;//unQualified approach

public class IceCream {
	public static void makeMangoIceCream() {
//		food_item.Fruit mangoes=new food_item.Fruit();//Qualified name approach
		Fruit mangoes=new Fruit();
		mangoes.toString();
		System.out.println("Mangoes IceCream created");
	}
	public static void makeMixfruitIceCream() {
		Fruit mangoes=new Fruit();
		Fruit apple=new Fruit();
		Fruit oranges=new Fruit();
		
	}
	public static void main(String[] args) {
		makeMangoIceCream();
	}
}
