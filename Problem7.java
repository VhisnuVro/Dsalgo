import java.util.Scanner;
// Take an integer A as input. You have to tell whether A is divible by both 5 and 11 or not.

// Input Format

// The input contains a single integer A.

// Constraints

// 1 <= A <= 10^9

// Output Format

// Print 1 if A is divisible by both 5 and 11, else print 0.

public class Problem7 {
   public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        if(1 <= input && input <= 1000000000)
       if(input % 5 == 0 && input % 11 == 0)
       {
        System.err.println(1);
       }else
       {
          System.err.println(0);
       }
        scanner.close();
   } 
}
