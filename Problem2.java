import java.util.Scanner;
// Write a program to input three numbers(A, B & C) from user and print the maximum element among A, B & C in each line.

// Input Format

// First line is a single integer A. Second line is a single integer B. Third line is a single integer C.

// Constraints

// 1 <= A <= 1000000

// 1 <= B <= 1000000

// 1 <= C <= 1000000

// Output Format

// One line containing an integer as per the question.

// Sample Input 0

// 5 
// 6 
// 7
// Sample Output 0

// 7
public class Problem2 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
     Scanner scanner = new Scanner(System.in);
        int input1 = scanner.nextInt();
        int input2 = scanner.nextInt();
        int input3 = scanner.nextInt();

        int greater = input1;
       if(input2 >input1)
       {
        greater = input2;
       }
       if (greater < input3)
       {
         greater = input3;
       }
        System.out.println(greater);
        scanner.close();
    
    }
}
