import java.util.Scanner;
class Exchange{
    public static void main(String[] args){
        int[] num;
        int n,max,min,temp,submax,submin;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        num = new int[n];
        for(int i = 0;i < n;i ++){
            num[i] = sc.nextInt();
        }
        max = num[0];
        submax = 0;
        min = num[0];
        submin = 0;
        for (int i = 1;i < n;i ++){
            if (num[i] > max){
                max = num[i];
                submax = i;
            }
            if (num[i] < min) {
                min = num[i];
                submin = i;
            }
        }
        if (submin == n - 1 && submax == 0){
            temp = max;
            num[submax] = min;
            num[submin] = temp;
        }else {
            temp = num[0];
            num[0] = min;
            num[submin] = temp;
            temp = num[n - 1];
            num[n - 1] = max;
            num[submax] = temp;
        }
        for (int i = 0;i < n;i ++){
            System.out.printf("%d ",num[i]);
        }
    }
}