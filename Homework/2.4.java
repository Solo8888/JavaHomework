import java.util.*;
class VolumeOfSphere{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		double r,v,PI=3.14;
		r=sc.nextDouble();
		v=(4.0 / 3) * Math.pow(r,3) * PI;
		System.out.printf("%.3f",v);
	}
}