/*
 * Fermat's Last Theorem - Near Miss
 * File Holding the Program: PossibleSmallestMiss
 * 
 * Programmers Names: 
 * 1. Shivasai Priyatham Kota(ShivasaiPriyathamK@lewisu.edu)
 * 2. Akshitha Prasad Thakur (AkshithaPrasadThak@lewisu.edu)
 * 
 * Course: FA22-CPSC-60500-004
 * 
 * November 20, 2022
 * 
 * Explanation: first of all setting he upper and lower limit of k, and according to that limit range, x and y values are generating according to the k vallue. Value of n is randomly generating with in
 *  the limit 2<n<12. then according to the method of finding the near miss, we followed the method the equation and calculating the near miss vlue, and at the end also finding the nearest miss.
 *  
 *  Resources: Youtube video to understand the concept of the theorem. https://www.youtube.com/watch?v=ReOQ300AcSU
 * 
 */
import java.util.Scanner;
import java.lang.Math;
import java.util.Random;
public class PossibleSmallestMiss {
	
	//Main Function to compute the results

	public static void main(String[] args) 
	{ 
	    int x=0;
	    int y = 0;
	    int z = 0;
	    int n = 0;
	    
	    // This lower limit is for K variable
	    int lower_limit = 10; 
	    // THis upper limit is for variable K
	    int upper_limit = 42;
	    
	    
	    
	    Scanner userinput = new Scanner(System.in);
	    
	    //Here taking user input, to solve the equations multiple times, and how many times it will solve, this we are taking from user
	    System.out.print("Please Enter the number of how many times you want to run the program = ");
	    int count = userinput.nextInt();
	    
	    double smallestmiss = 99999999.99; 
	    
	    //for loop will execute count times, and will compute the near miss count times
	    for (int i =0; i<count; i++) 
	    {
	        	
	        	x =  (int) ((Math.random() * (upper_limit - lower_limit)) + lower_limit);
	        	y =  (int) ((Math.random() * (upper_limit - lower_limit)) + lower_limit);
	        	n =  (int) ((Math.random() * (11 - 3)) + 3);
	        	
	        	System.out.print("The Value of x = " + x + "\n");
	        	System.out.print("The Value of y = " + y + "\n");
	        	System.out.print("The Value of n = " + n + "\n");
	        	
	        
	        //x^n + y^n
	        int xnplusyn = (int)((Math.pow (x, n))+(Math.pow (y, n)));
	        
	        //To make the equation in the form of fermat's equation as mentioned in instructions we are taking nth root
	        z = (int) Math.pow (xnplusyn, 1.0/n);
	        
	        //if we subtract z power n from sum of x power of n and y of power of n we get the near miss value
	        int nearmiss = (int)(xnplusyn - Math.pow (z, n));
	        
	        
	        //By following the instructions how can we find the relative miss, applying same thing here to find out the relative miss
	        double relativemiss = 100. * nearmiss / xnplusyn;
	        System.out.println("\n\nNear Miss = "+nearmiss+" \nRelative Miss = "+relativemiss);
	        
	        
	        //to find out the smallest possible miss, comparing relative miss with smallest miss
	        if(relativemiss<smallestmiss)
	        {
	        	smallestmiss=relativemiss;
	        }
	        System.out.println("Smallest Possible Miss = "+smallestmiss);
	        System.out.println("\n");
	           
	    }
	}
}


