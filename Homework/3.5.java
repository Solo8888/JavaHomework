import java.util.*;
class CountTheNumbers{
    public static void main(String[] args){
        int n,cnt,zero = -1,positive = 0,negative = 0;
        int[] num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Please input n:");
        n = sc.nextInt();
        num = new int[n + 1];
        for (cnt = 0;cnt < n;cnt ++){
            num[cnt] = sc.nextInt();
        }
        for (cnt = n;cnt >= 0;cnt --){
            switch (count(num[cnt])){
                case 0:
                    negative += 1;
                    break;
                case 1:
                    zero += 1;
                    break;
                default:
                    positive +=1;
                    break;
            }
        }
        System.out.printf("Positive: %d, Zero: %d, Negative: %d",positive,zero,negative);
    }
    static int count(int a){
        if (a > 0)return 2;
        else if (a == 0) return 1;
        else return 0;
    }
}
