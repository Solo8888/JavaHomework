import java.util.Scanner;
class Exist{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a[]= {9,13,25,34,38,62,69,78,86,97};
        int searchnum = sc.nextInt();
        int index,left,mid,right;
        index = -1;
        left = 0;
        right = a.length - 1;
        while (left <= right){
            mid = (left + right) / 2;
            if (a[mid] == searchnum){
                index = mid;
                break;
            } else if (a[mid] < searchnum){
                left = mid +1;
            }else right = mid - 1;
        }
        if (index == -1){
            System.out.println("Does not exist in the array.");
        }else System.out.println("The position in the array is "+index);
    }
}