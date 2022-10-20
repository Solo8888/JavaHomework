import java.util.*;
class Square{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        String str = "";
        n = sc.nextInt();
        for (int i = 1;i <= n;i ++){
            for(int j = 1;j <= n;j ++){
                str = str + "*";
                if (j == n)str = str + "\n";
            }
        }
        System.out.println(str);
    }
}