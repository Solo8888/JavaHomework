import java.util.Scanner;
class Max{
    public static void main(String[] args){
        int[] num;
        int n,max,maxsub;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        num = new int[n];
        for(int i = 0;i < n;i ++){
            num[i] = sc.nextInt();
        }
        max = num[0];
        maxsub = 0;
        for (int i = 1;i < n;i ++){
            if (num[i] > max){
                max = num[i];
                maxsub = i;
            }
        }
        System.out.printf("The maximum number is %d, and it's subscript is %d",max,maxsub);
    }
}