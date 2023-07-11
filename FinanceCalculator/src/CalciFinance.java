/**The Height Converter**

You are part of a sports data management team. The team is developing a new feature for their application where the heights of players, currently recorded in inches, need to be displayed in feet for an international audience. Your task is to create a method that takes a height given in inches and converts it into feet.

**Hint:** The conversion factor from inches to feet is 1 foot = 12 inches.

**Class Definition:**

public class HeightConverter {

public double convertInchesToFeet(double inches);

}

**Inputs:**

The method convertInchesToFeet(double inches) will receive one parameter:

- inches (0 ≤ inches ≤ 10^9): a double representing the height in inches.

**Outputs:**

The method will return a double - the height converted to feet.

**Example:**

**Sample Input:**

HeightConverter converter = new HeightConverter();

converter.convertInchesToFeet(72.0);

**Sample Output:**

6.00

**Note:**

In the sample input, the height of the player is 72.0 inches. The height in feet is 72/12 = 6.00, so the method returns 6.00 as the output. Your method will be crucial in helping the sports data management team present the data in a format familiar to the international audience. Good luck, data manager!

Question: 13 **Problem: The Finance Calculator**

You are a software developer at a financial technology company. The company is building a new feature in their app that calculates the simple interest for users wanting to take out loans. Your task is to create a method that calculates the simple interest given the principal amount, rate of interest, and time.

**Hint:** The formula to calculate simple interest is:

I = P * R * T

Where:

- I is the simple interest

- P is the principal amount

- R is the rate of interest (in decimal)

- T is the time (in years)

**Class Definition:**

public class FinanceCalculator {

public double calculateSimpleInterest(double principal, double rate, double time);

}

**Inputs:**

The method calculateSimpleInterest(double principal, double rate, double time) will receive three parameters:

- principal (1 ≤ principal ≤ 10^9): a double representing the principal amount.

- rate (0 ≤ rate ≤ 1): a double representing the rate of interest in decimal.

- time (1 ≤ time ≤ 10^5): a double representing the time in years.

**Outputs:**

The method will return a double - the simple interest.

**Example:**

**Sample Input:**

FinanceCalculator calculator = new FinanceCalculator();

calculator.calculateSimpleInterest(1000.0, 0.05, 2.0);

**Sample Output:**

100.00

**Note:**

In the sample input, the principal amount is 1000.0 units, the rate of interest is 0.05, and the time is 2.0 years. The simple interest is 1000.0 * 0.05 * 2.0 = 100.00, so the method returns 100.00 as the output. Your method will be crucial in helping users plan their finances. Good luck, developer!*/
import java.util.*;
public class CalciFinance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		double principal=scan.nextDouble();
		double rate=scan.nextDouble();
		double time=scan.nextDouble();
		FinanceCalci a=new FinanceCalci();
		System.out.printf("%.2f",a.calculateSimpleInterest(principal, rate, time));
	}

}
