/**Halve It**

You are helping a friend in developing a financial app. The app has a feature where it calculates half of the entered amount for splitting bills. Your task is to write a function that takes a number and returns its half.

**Function:**

public static double halveTheNumber(double num);

**Inputs:**

The function halveTheNumber(double num) will receive one parameter:

- num (0 ≤ num ≤ 10^9): a double which represents the amount entered by the user to be halved.

**Outputs:**

The function will return a double - the result of halving the num.

**Example:**

**Sample Input:

halveTheNumber(150.00);

Sample Output:

75.00

Note:

In the sample input, the number given to the function is 150.00. The half of this number is 150.00/2=75.00, so the function returns 75.00 as the output. Make sure your function works correctly to split the bills accurately.*/

import java.util.*;
public class Halve_itfun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the double number");
		double num=scan.nextDouble();
		double b= halveTheNumber(num);
		System.out.printf("%.2f",b);
	}
	public static double halveTheNumber(double num) {
		double a=num/2;
		return a;
		
	}

}
