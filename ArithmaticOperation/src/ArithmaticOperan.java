/**Problem: Arithmetic Operations

You are a programmer in a school. The mathematics teacher has asked for your help to teach basic arithmetic operations to students. Your task is to create a set of functions that will do subtraction, multiplication, division, and find the remainder of two numbers.

Functions:

public static int subtractNumbers(int num1, int num2);

public static int multiplyNumbers(int num1, int num2);

public static double divideNumbers(int num1, int num2);

public static int findRemainder(int num1, int num2);

Inputs:

Each function will receive two parameters:

- num1 : an integer which represents the first number.

- num2 : an integer which represents the second number.

Outputs:

1. The subtractNumbers function will return an integer - the result of subtracting num2 from num1.

2. The multiplyNumbers function will return an integer - the result of multiplying num1 and num2.

3. The divideNumbers function will return a double - the result of dividing num1 by num2. Round off the result till 2 decimal places.

4. The findRemainder function will return an integer - the remainder when num1 is divided by num2.

Sample Input:

subtractNumbers(20, 5);

multiplyNumbers(4, 5);

divideNumbers(20, 4);

findRemainder(10, 3);

Sample Output:

15

20

5.00

1

Note:

In the sample input, the numbers given to the functions are (20, 5), (4, 5), (20, 4) and (10, 3) respectively. The functions correctly return the results of subtraction, multiplication, division and finding the remainder.*/
import java.util.*;
public class ArithmaticOperan {
	public static void main(String []args) {
		int num1;
		int num2;
		int res=subtractNumbers(20,5);
		System.out.println(res);
		int r=multiplyNumbers(4,5);
		System.out.printf("%d\n",r);
		double s=divideNumbers(20,4);
		System.out.printf("%.2f \n",s);
		int f=findremainder(10,3);
		System.out.println(f);
		
		
	}
	public static int subtractNumbers(int num1,int num2) {
		return  num1-num2;
	}
	public static int multiplyNumbers(int num1,int num2) {
		return  num1*num2;
	}
	public static double divideNumbers(int num1,int num2) {
		return  num1/num2;
	}
	public static int findremainder(int num1,int num2) {
		return  num1%num2;
	}
}
