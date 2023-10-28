import java.util.Scanner;

// Write a program to input an integer(A) from user and print the Ath month of the year.

// Months list: {January, February, March, April, May, June, July, August, September, October, November, December}

// Input Format

// One line containing an integer integer A.

// Constraints

// 1 <= A <= 12

// Output Format

// One line containing the Ath month of the year.

// Sample Input 0

// 1
// Sample Output 0

// January
public class Problem4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Input1 = scanner.nextInt();
        String[] months = {"January","February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        if(Input1 < 13)
        System.out.println(months[Input1-1]);
        scanner.close();


    }
    
}
