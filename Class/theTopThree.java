import java.util.*;
class TopThree {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int[] a=new int[n];
        int i, max;
        for(i = 0;i < a.length;i ++) {
            a[i] = sc.nextInt();
        }
        int tmp;
        for(i = 0;i < 3;i ++){
            max = i;
            for (int j = i;j <= n - 1;j++){
                if(a[j] > a[max]) {
                    max = j;
                }
                if (!(max == i)){
                    tmp = a[i];
                    a[i] = a[max];
                    a[max] = tmp;
                }
            }
        }
        System.out.printf("%d,%d,%d",a[0],a[1],a[2]);
    }
}