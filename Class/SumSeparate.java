import java.util.Scanner;
class Separate{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0;i <= n / 2;i ++){
            System.out.printf("%d + %d = %d\n",i,n-i,n);
        }
    }
}