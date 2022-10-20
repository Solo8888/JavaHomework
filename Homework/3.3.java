import java.util.*;
class PrimeNumber{
    static boolean prime(int k){
        if (k <= 1)return false;
        for (int i = 2;i < k;i ++){
            if (k % i == 0)return false;
        }
        return true;
    }
    public static void main(String[] args){
        int i,x,y;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();
        for (i = x;i < y;i ++){
            if (prime(i))System.out.println(i);
        }
    }
}