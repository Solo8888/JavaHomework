import java.util.*;
class Drinking{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int h = sc.nextInt(),s = sc.nextInt(),v,n;
		v = h * s;
		if(20 * 1000 % v > 0){
			n = 20 * 1000 / v + 1;
		}else{
			n = 20 * 1000 / v;
		}
		System.out.printf("It needs to drink %d barrels of watter.",n);
	}
}