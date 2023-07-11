/**The Journey Calculator

You are a developer at a transportation company. The company is developing a new app that helps users track their journey. One of the features of the app is to calculate the distance

travelled given the speed and time of the journey. Your task is to create a method that takes speed and time and returns the distance travelled. This method should be a non-static method and should be implemented inside a class named JourneyCalculator.

Class Definition:

public class JourneyCalculator {

public double calculateDistance(double speed, double time);

}

Inputs:

The method calculateDistance(double speed, double time) will receive two parameters:

- speed : a double representing the speed of the vehicle in km/h.

- time : a double representing the time travelled in hours.

Outputs:

The method will return a double - the distance travelled. Round off the result to 2 decimal places.

Sample Input:

JourneyCalculator journeyCalculator = new JourneyCalculator();

journeyCalculator.calculateDistance(60.0, 1.5);

Sample Output:

90.00

Note:

In the sample input, the user's speed is 60 km/h and the time travelled is 1.5 hours. The distance travelled is speed*time = 60*1.5 = 90 kilometers, so the method returns 90.00 as the output. Your method will be crucial in helping users track t*/
public class DistanceCal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double s;
		double t;
		JourneyCalculator journeyCalculator = new JourneyCalculator();

		journeyCalculator.calculateDistance(60.0, 1.5);
		
		

	}

}
