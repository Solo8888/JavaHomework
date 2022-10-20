import java.util.Scanner;
class BinarySystem{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        String str = "";
        for (;d != 0;){
            str = (d % 2) + str;
            d = d / 2;
        }
        System.out.printf("%s",str);
    }
}