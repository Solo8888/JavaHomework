import java.util.Scanner;
class Tower {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        String str = "";
        char ch;
        n = sc.nextInt();
        for (int i = 1;i <= n ;i ++){

            for (int j = 1;j <= n - i ;j ++ ){
                str = str + " ";
            }

            for (int j = 1;j <= i * 2 - 1;j ++){
                ch = (char) ('A'+ i - 1);
                str = str + ch;
            }

            System.out.printf("\n%s??? ",str);
            str = "";
        }
    }
}