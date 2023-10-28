// Given two numbers A and B. Print the floor of A/B.

// Input Format

// There are two input lines The first line has a single integer A. The second line has a single integer B.

// Constraints

// 1 <= A, B <= 10^4

// Output Format

// Print the floor of A/B in a single line.

// Sample Input 0

// 4
// 5
// Sample Output 0

// 0
import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
              Scanner scanner = new Scanner(System.in);
        
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        int result = A / B;
        System.out.println(result);

        scanner.close();
    }
}
