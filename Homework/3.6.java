import java.util.*;
class Mark {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = 100,mark,failed = 0,total = 0;
        double average;
        for (int i = 1;i <= n;i ++){
            mark = sc.nextInt();
            if (mark < 60)failed ++;
            total += mark;
        }
        average =(double)total / n;
        System.out.printf("The average score of the course is %f, and the number of failed students is %d.",average,failed);
    }
}
