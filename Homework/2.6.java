import java.util.*;
class TimeOfSwimming{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a,b,c,d,hour = 0,minute;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		if (c - a < 0){
			System.out.print("Input error, please re-input.");
		}else{
			hour = c - a;
			if (d - b < 0){
				hour -= 1;
				d += 60;
			}
		}
		minute = d - b;
		System.out.printf("It has swum for %d hours %d minutes.",hour,minute);
	}
}