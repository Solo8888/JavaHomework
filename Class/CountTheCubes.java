import java.util.Scanner;
class Count{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sum = 0,num = 0,n = sc.nextInt();
        for (int i = 1;i <= n;i ++){
            num += i;
            sum += num;
        }
        System.out.printf("There are %d cubes.",sum);
    }
}