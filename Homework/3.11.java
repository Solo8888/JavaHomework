import java.util.Scanner;
class LuckyNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n,cnt,max = 0,maxi = 0;
        n = sc.nextInt();
        int[] num;
        num = new int[n + 1];
        for (int i = 1;i <= n;i ++){
            num[i] = sc.nextInt();
        }
        for (int i = 1;i <= n;i ++){
            cnt=ndigit(num[i]);
            if (cnt > max){
                max = cnt;
                maxi = i;
            }
        }
        if (max == 0){
            System.out.println("NO");
        }else{
            System.out.printf("The largest lucky number is: %d.",num[maxi]);
        }
    }
    static int ndigit(int n){
        int count = 0;
        while(n > 0){
            if (n % 10 == 8){
                count++;
            }
            n /= 10;
        }
        return count;
    }
}