import java.util.*;
class DegreeCelsius{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double c = sc.nextDouble(),f;
		f = (9.0 / 5) * c + 32;
		System.out.printf("%.2f",f);
	}
}