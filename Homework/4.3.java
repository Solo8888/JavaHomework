import java.util.*;
class DotProduct{
    public static void main(String[] args){
        int a[] = {1,2,3,4,5,6};
        int b[] = {11,22,33,44,55,66};
        int c[] = {0,0,0,0,0,0};
        for (int i = 0;i < a.length;i ++){
            c[i] = a[i] * b[i];
        }
        for (int i = 0;i < c.length;i ++){
            System.out.printf("%d ",c[i]);
        }
    }
}