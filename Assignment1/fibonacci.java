import java.util.*;
public class fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        int n=sc.nextInt();
        int n1=0,n2=1;
       

        
        for(int i=1;i<=n;i++) {
            System.out.print(n1 + " ");
            int sumOfPrevTwo = n1 + n2;
            n1 = n2;
            n2 = sumOfPrevTwo;
            
        }
        

    }
}
