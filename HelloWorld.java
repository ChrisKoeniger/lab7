package HelloWorld;
import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world, this is Chris!");
		Scanner scnr = new Scanner(System.in);
	      double wallHeight;
	      double wallWidth;
	      double wallArea;
	      double paintGallons;
	      int cansPaint;
	      
	      System.out.println("Enter wall height (feet):");
	      wallHeight = scnr.nextDouble();
	      
	      System.out.println("Enter wall width (feet):");
	      wallWidth = scnr.nextDouble();                   // FIXME (1): Prompt user to input wall's width
	      
	      // Calculate and output wall area
	      wallArea = wallHeight*wallWidth;                       // FIXME (1): Calculate the wall's area
	      System.out.println("Wall area: " + wallArea + " square feet");     // FIXME (1): Finish the output statement
	      
	      // FIXME (2): Calculate and output the amount of paint in gallons needed to paint the wall
	      paintGallons = wallArea/350.0;
	      System.out.println("Paint needed: " + paintGallons + " gallons");
	      // FIXME (3): Calculate and output the number of 1 gallon cans needed to paint the wall, rounded up to nearest integer
	      cansPaint = (int)paintGallons + 1;
	      System.out.println("Cans needed: " + cansPaint + " can(s)");
	}

}
