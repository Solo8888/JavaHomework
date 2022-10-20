import java.util.Scanner;
class Prime{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(),y = sc.nextInt(),n;
        while (! (x == 0 && y == 0)){
            for (int i = x;i <= y;i ++){
                n = i * i + i + 41;
                for(int j = 2;j <= i;j ++){
                   if(n % j != 0){
                       System.out.println("Sorry");
                   }else{
                       x = sc.nextInt();
                       y = sc.nextInt();
                   }
                }
            }
        }
    }
}