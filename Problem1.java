import java.util.Scanner;
// Write a program to input two numbers(A & B) from user and print the maximum element among A & B in each line.

// Input Format

// First line is a single integer A. Second line is a single integer B.

// Constraints

// 1 <= A <= 1000000

// 1 <= B <= 1000000

// Output Format

// One line containing the greater integer A or B.

class Problem1 {
    public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
        int input1 = scanner.nextInt();
        int input2 = scanner.nextInt();

        int greater;
        if (input1 > input2) {
            greater = input1;
        } else {
            greater = input2;
        }
        System.out.println(greater);
        scanner.close();
    }
}