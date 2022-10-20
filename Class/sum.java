import java.util.Scanner;
class Sum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double n,m,ans;
        while(sc.hasNext()){
            n = sc.nextDouble();
            m = sc.nextDouble();
            ans = Sum(n,m);
            System.out.printf("%.2f",ans);
            break;
        }
    }
    public static double Sum(double a,double b){
        double root = 0,sum = 0;
        for(int i = 1;i < b;i ++) {
            root = Math.sqrt(a);
            sum += (a + root) * (b - 1) / 2;
        }
        return sum;
    }
}