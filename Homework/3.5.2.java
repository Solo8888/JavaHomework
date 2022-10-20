import java.util.*;
class CountTheNumbers2{
    public static void main(String[] args){
        int n,cnt,zero = 0,positive = 0,negative = 0,num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Please input n:");
        n = sc.nextInt();
        for (cnt = 1;cnt <= n;cnt ++){
            num = sc.nextInt();
            if (num > 0) {
                positive += 1;
            } else if (num == 0) {
                zero += 1;
            }else negative += 1;
        }
        System.out.printf("Positive: %d, Zero: %d, Negative: %d",positive,zero,negative);
    }
}