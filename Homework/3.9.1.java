import java.util.*;
class CompetitionMark1 {
    public static void main(String[] args){
        int n,cnt,min = 0,max = 0,sum = 0,mark;
        double average;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (cnt = 1;cnt <=n;cnt ++) {
            mark = sc.nextInt();
            min = mark;
            max = mark;
            for (int i = 2; i <= cnt; i++) {
                if (mark > max) {
                    max = mark;
                } else if (mark < min) {
                    min = mark;
                }
            }
            sum += mark;
        }
        sum = sum - min -max;
        average = (double) sum / (n - 2);
        System.out.printf("The competitor has got %f points.",average);
    }
}