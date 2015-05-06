package edu.saintjoe.cs.brianc.attr;

public class ColorAttrDriver {
	
	public static void main(String[] args ) {
		
		ColorAttr testOne, testTwo, testThree;
		Attr testFour;
		
		//Example of overloaded method
		
		// We need this object for the third ColorAttr constructor
		ScreenColor newColor = new ScreenColor("green");
		
		// Test out our constructors
		
		// Number one
		testOne = new ColorAttr("ColorOne","red");
		System.out.println(testOne.toString());
		
		//Example of overridden method
		
		// Number two
		testTwo = new ColorAttr("ColorTwo");
		System.out.println(testTwo.toString());
		
		// Number three
		testThree = new ColorAttr("ColorThree", newColor);
		System.out.println(testThree.toString());
		
		//Creating a new color to test/ print out
	
		// Number four
		testFour = new Attr("ColorFour", "yellow");
		System.out.println(testFour.toString());
		
		//Creating a new Attr and marking exact color (yellow) to "color four"
		
		// Number five
		testFive = new Attr("ColorFive", "chartreuse");
		System.out.println(testFive.toString());
		
		//Number six
		testSix = new Attr("ColorSix", "crimson");
		System.out.println(testSix.toString());
		
	} // end main
}