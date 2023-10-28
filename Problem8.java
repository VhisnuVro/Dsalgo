import java.util.Scanner;

// Write a program to input from user three numbers(A, B & C) representing side lengths of a triangle.

// You have to print if the traingle is "equilateral", "scalene" or "isosceles".

// Input Format

// One line containing three space separated integers A, B & C.

// Constraints

// 1 <= A <= 100000

// 1 <= B <= 100000

// 1 <= C <= 100000

// Output Format

// One string either "equilateral", "scalene" or "isosceles".

// Sample Input 0

// 5 6 7
// Sample Output 0

// scalene
// Explanation 0

// Since all sides are different, hence it's a scalene triangle.
public class Problem8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        // Check the type of triangle
        if (A == B && B == C) {
            System.out.println("equilateral");
        } else if (A != B && B != C && A != C) {
            System.out.println("scalene");
        } else {
            System.out.println("isosceles");
        }

        scanner.close();
    }
}
