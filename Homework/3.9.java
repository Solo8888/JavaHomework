import java.util.*;
class CompetitionMark {
    public static void main(String[] args){
        int n,cnt = 0,min,max,sum = 0;
        int[] mark;
        double average;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        mark = new int[n + 1];
        for (;cnt <n;cnt ++){
            mark[cnt] = sc.nextInt();
        }
        min = mark[1];
        max = mark[1];
        for (int i = 1;i <= cnt;i ++){
            if (mark[i] > max){
                max = mark[i];
            }else if (mark[i] < min){
                min = mark[i];
            }
        }
        for (int i = 0;i <= cnt;i ++){
            sum += mark[i];
        }
        sum = sum - min -max;
        average = (double) sum / (n - 2);
        System.out.printf("The competitor has got %f points.",average);
    }
}