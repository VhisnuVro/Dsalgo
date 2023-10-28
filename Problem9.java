import java.util.Scanner;
// Write a program to input a number(A) from user and print 1 if it is positive, -1 if it is negative, 0 if it's neither positive nor negative.

// Input Format

// One line containing an integer A.

// Constraints

// 1 <= A <= 1000000

// Output Format

// One line each 0/1/-1 as per the question.

// Sample Input 0

// 50
// Sample Output 0

// 1
public class Problem9 {
    public static void main(String[] args) {
              Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        // Check the type of triangle
        if (input >0) {
            System.out.println(1);
        } else if (input < 0) {
            System.out.println(-1);
        } else {
            System.out.println(0);
        }

        scanner.close();
    }
}
