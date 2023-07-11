import java.util.*;
public class GalacticArithfunc {

	public static void main(String[] args) {
		// TODO Auto-generated method stubs
		Scanner scan=new Scanner(System.in);
		long a=scan.nextLong();
		long b=scan.nextLong();
		long res=galactic(a,b);
		System.out.println(res);

	}
	public static long galactic(long a,long b) {
		return a+b;
	}
}

