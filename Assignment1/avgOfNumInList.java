import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class avgOfNumInList {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a list of numbers :");
        System.out.println("Enter -1 to stop");

        int n;
        do {
            n = sc.nextInt();
            if (n != -1) {
                l1.add(n);
            }
        } while (n != -1);

        

        double sum = 0;
        for (int num : l1) {
            sum += num;
        }

        double average = sum / l1.size();
        System.out.println("Average of numbers in list: " + average);

    }
}
