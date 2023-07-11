/**The Double Trouble

You are participating in a coding competition at your school. The challenge is to create a function that can double the value of any number provided. This function will help in the game design where scores need to be doubled under certain conditions.

Function:

public static int doubleTheNumber(int num);

Inputs:

The function doubleTheNumber(int num) will receive one parameter:

- num : an integer which represents the number to be doubled.

Outputs:

The function will return an integer - the result of doubling the num.

Sample Input:

doubleTheNumber(15);

Sample Output:

30

Note:

In the sample input, the number given to the function is 15. The double of this number is 15*2=30, so the function returns 30 as the output. Your function should work accurately to make sure you win this competition. Good Luc*/
import java.util.*;
public class DoubleTroub {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		int res=doubleTheNumber(num);
		System.out.println(res);
		

	}
	public static int doubleTheNumber(int num) {
		return num*2;
		
		
	}

}
