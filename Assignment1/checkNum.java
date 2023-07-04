import java.util.*;
public class checkNum {
    public static void check(int n){
        if(n>0){
            System.out.println("Entered number is positive");

        }
        else if(n<0){
            System.out.println("Entered number is negative");
        }
        else{
            System.out.println("Entered number is zero");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number you want to check");
        int n=sc.nextInt();
        check(n);
    }
}
