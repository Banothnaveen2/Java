/**The Planet Explorer**

You are a scientist at a space research center. The center is currently researching various planets and their properties. One of the properties they are interested in is the surface area of these planets. Considering that a planet can be approximated as a sphere, your task is to create a method that calculates the surface area of a sphere given its radius.

**Hint:** The formula to calculate the surface area of a sphere is:

A = 4πr^2

Where:

- A is the surface area of the sphere

- r is the radius of the sphere

**Class Definition:**

public class PlanetExplorer {

public double calculateSurfaceArea(double radius);

}

**Inputs:**

The method calculateSurfaceArea(double radius) will receive one parameter:

- radius : a double representing the radius of the sphere (planet).

**Outputs:**

The method will return a double - the surface area of the sphere.

**Example:**

**Sample Input:**

PlanetExplorer explorer = new PlanetExplorer();

explorer.calculateSurfaceArea(3.0);

**Sample Output:**

113.10

**Note:**

In the sample input, the radius of the planet (sphere) is 3.0 units. The surface area is 4π*3^2 = 113.10, so the method returns 113.10 as the output. Your method will be essential in helping the scientists at the space research center in understanding the properties of various planets. Good luck, scientist!*/

import java.util.*;
public class Areaofplanet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the radius");
		double d=scan.nextDouble();
		PlanetExplorer a=new PlanetExplorer();
		System.out.printf("%.2f",a.calculateSurfaceArea(d));

	}

}
