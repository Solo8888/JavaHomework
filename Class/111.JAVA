import java.util.*;
class Chengji{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int scr = sc.nextInt();
		if(scr <= 100 && scr >= 90){
			System.out.println("Excellent!");
		}else if(scr >= 80 && scr < 90){
			System.out.println("Good!");
		}else if(scr >= 70 && scr < 80){
			System.out.println("Medium!");
		}else if(scr >= 60 && scr < 70){
			System.out.println("通过!");
		}else{
			System.out.println("Failed!");
		}
	}
}