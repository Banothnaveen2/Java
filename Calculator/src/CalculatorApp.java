import java.util.*;
public class CalculatorApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("====> Welcome to calculator project <===");
		boolean flag=true;
		while(flag)
		{
			System.out.println("enter the +-->addition\n - -->subtraction \n* -->multiplication\n/-->division\n%-->modulo\n^-->square\n!-->stop");
			
			char c=scan.next().charAt(0);
			if(c=='!'){ 
				break;
			}
			int a=scan.nextInt();
			int b=scan.nextInt();
			
			Calculatorfunc d=new Calculatorfunc();
			
			switch(a) {
			
			case '+':
				d.addition(a,b);
				break;
			case '-':
				
				d.subtraction(a,b);
				break;
				
			case '*':
				d.multiplication(a,b);
				break;
				
			case '/':
				d.division(a,b);
				break;
			case '%':
				d.modulo(a,b);
				break;
				
			case '^':
				d.perfectsquare(a);
				break;
			
				
			default:
				System.out.println("you entered incorrect message in the command line");
				break;
			}
			
			
		}	

	}

}
