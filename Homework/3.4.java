import java.util.*;
class GuessNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = (int)(Math.random() * 100) + 1;
        while (true){
            int k = sc.nextInt();
            if (k > t) {
                System.out.println("Too large.");
            }else if (k < t) {
                System.out.println("Too small.");
            }else{
                System.out.println("Congratulations!");
                break;
            }
        }
    }
}