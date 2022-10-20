import java.util.Scanner;
class prime{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        String str = "";
        n = sc.nextInt();
        for (int i = 2;i <= n;i ++){
            if (prime(i)){
                str = str + i +"\n";
            }
        }
        System.out.print(str);
    }
    static boolean prime(int k){
        if (k <= 1)return false;
        for (int i = 2;i < Math.sqrt(k);i ++){
            if (k % i == 0)return false;
        }
        return true;
    }
}
