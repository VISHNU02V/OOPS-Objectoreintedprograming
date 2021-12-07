// To find the sum of 2 numbers using java

import java.io.*;                                          // importing
import java.util.Scanner;
public class Main                                          // class
{
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);                 // using Scanner to input
		System.out.println("TO FIND THE SUM OF 2 NUMBERS");		
		System.out.print("enter the 1st numbers:_::_:");
		int num1 = input.nextInt();                            // inputing 1st number 
		System.out.print("enter the 2nd numbers:_::_:");
                int num2 = input.nextInt();                            // inputing 2nd number
                int num3 = num1 + num2;                           // sum
                System.out.println("THE SUM");
                System.out.println(num1+"+"+num2+"="+num3);             // displaying
	}
}
