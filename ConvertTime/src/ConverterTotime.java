import java.util.*;
public class ConverterTotime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int minutes=scan.nextInt();
		double a=convertToHours(minutes);
		System.out.printf("%.1f",a);
	}
	public static double convertToHours(int minutes) {
		double a=minutes/60.0;
		return a;
		
	}

}
