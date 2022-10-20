import java.util.Scanner;
class Square1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n,i = 1,j = 1;
        String str = "";
        n = sc.nextInt();
        while(i <= n){
            while (j <= n){
                str = str + "*";
                if (j == n)str = str + "\n";
                j ++;
            }
            j = 1;
            i ++;
        }
        System.out.println(str);
    }
}