import java.util.*;
class SumOfCube{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int ge,shi,bai,shuZi = sc.nextInt(),he;
		ge = shuZi % 10;
		shi = (shuZi / 10) % 10;
		bai = (shuZi / 100);
		he = (int)Math.pow(ge,3) + (int)Math.pow(shi,3) + (int)Math.pow(bai,3);
		System.out.printf("sum: %d",he);
	}
}