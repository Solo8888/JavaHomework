import java.util.*;
class  Sevens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k,count = 0;
        int a = sc.nextInt();
        if (a < 0)a = -a;
        while (a != 0){
            k =a % 10;
            a /= 10;
            if (k == 7){
                count ++;
            }
        }
        System.out.println(count);
    }
}
