import java.util.*;
class CountTheNumbers1{
    public static void main(String[] args){
        int n,cnt,zero = 0,positive = 0,negative = 0,num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Please input n:");
        n = sc.nextInt();   //输入n
        for (cnt = 0;cnt < n;cnt ++){   //计算器计算循环次数
            num = sc.nextInt(); //输入数字
            switch (count(num)) {
                case 0 -> negative += 1;
                case 1 -> zero += 1;
                default -> positive += 1;
            }
        }
        System.out.printf("Positive: %d, Zero: %d, Negative: %d",positive,zero,negative);
    }
    static int count(int a){    //定义count用法，返回值用来给case
        if (a > 0)return 2;
        else if (a == 0) return 1;
        else return 0;
    }
}
