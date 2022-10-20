import java.util.*;
class BuyPens{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt(),pen;
		if (money < 10){
			System.out.print("Input error, please re-enter错误");
		}else{
			pen = money / 5;
			if(pen >= 20){
				pen = pen + (pen / 20) * 5 + (pen % 20) / 5;
			}else{
			pen += pen / 5;
			System.out.printf("He can buy %d pens at most.",pen);
			}
		}
	}
}