import java.util.Scanner;

// Write a program to calculate the percentage (according to marks of a student) and grade (according to the percentage of a student). Five numbers(A, B, C, D & E) represent the marks of a student in 5 subjects which are out of 100. Print the percentage and the grade of the student.

// If percentage >= 90% : Grade A If percentage >= 80% but <90 : Grade B If percentage >= 70% but <80: Grade C If percentage >= 60% but <70: Grade D If percentage >= 40% but <60: Grade E If percentage < 40%: Grade F

// NOTE: You have to take the lowest integer of the percentage. E.g. 90.8% will be treated as 90%.

// Input Format

// There will be five lines of inputs as following: The five lines contain the 5 subject marks of the student in numerical format.

// Constraints

// NA

// Output Format

// The first line indicates the percentage in integer format. The next line displays the grade in string format.

// Sample Input 0

// 50
// 60
// 70
// 80
// 90
// Sample Output 0

// 70
// C

public class Problem3 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
     Scanner scanner = new Scanner(System.in);
        int input1 = scanner.nextInt();
        int input2 = scanner.nextInt();
        int input3 = scanner.nextInt();
        int input4 = scanner.nextInt();
        int input5 = scanner.nextInt();

        int totalMark = input1 + input2 + input3 + input4 + input5;
        int percentage = (totalMark * 100) / 500;
        System.out.println(percentage);

        if (percentage >= 90) {
            System.out.println("A");
        } else if (percentage >= 80) {
            System.out.println("B");
        } else if (percentage >= 70) {
            System.out.println("C");
        } else if (percentage >= 60) {
            System.out.println("D");
        } else if (percentage >= 40) {
            System.out.println("E");
        } else {
            System.out.println("F");
        }

        scanner.close();
    
    }
    
}
