import java.util.*;
public class findLargestNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number");
        int num1= sc.nextInt();
        System.out.println("Enter Second Number");
        int num2= sc.nextInt();
        System.out.println("Enter Third Number");
        int num3= sc.nextInt();
      if(num1 >= num2) 
      {
         if(num1 >= num3)
         {
            System.out.println(num1 + " is largest number.");
         }
         else
         {
            System.out.println(num3 + " is largest number.");
            System.out.println(num3 + " is largest number.");
        }
     } 
     else 
     {
        if(num2 >= num3)
        {
           System.out.println(num2 + " is largest number.");
        }
        else
        {
           System.out.println(num3 + " is largest number.");
        }
    }

    }
}
