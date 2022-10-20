import java.util.Scanner;

class Square2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n,j = 1,i = 1;
        String str = "";
        n = sc.nextInt();
        do {
            do {
                str = str + "*";
                if (j == n)str = str + "\n";
                j ++;
            }while (j <= n);
            j = 1;
            i ++;
        }while (i <= n);
        System.out.println(str);
    }
}