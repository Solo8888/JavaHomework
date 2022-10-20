import java.util.Scanner;
class Diamond {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        String str = "";
        n = sc.nextInt();
        while (n % 2 != 1) {    //输入奇数，否则一直循环提示输入
            System.out.println("ERROR! Please input an odd.");
            n = sc.nextInt();
        }
        for (int i = 1;i <= n / 2 + 1;i ++){
            for (int j = 1;j <= (n + 1) / 2 - i;j ++ ){
                str = str + " ";
            }
            for (int j = 1;j <= i * 2 - 1;j ++){
                str = str +"*";
            }
            System.out.printf("\n%s",str);
            str = "";
        }
        for (int i = 1;i <= n / 2;i ++){
            for (int j = 1;j <= n / 2 - 2 + i;j ++){
                str = str + " ";
            }
            for (int j = 1;j <= n - 2 * i;j ++){
                str = str +"*";
            }
            System.out.printf("\n%s",str);
            str = "";
        }
    }
}
