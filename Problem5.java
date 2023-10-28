// You are given 3 integer angles(in degrees) A, B and C of a triangle. You have to tell whether the triangle is valid or not.

// A triangle is valid if sum of its angles equals to 180.

// Input Format

// First line of the input contains an integer A.

// Second line of the input contains an integer B.

// Third line of the input contains an integer C.

// Constraints

// 1 <= A, B, C <= 180

// Output Format

// Print 1 if the triangle having given sides is valid, else print 0.

// Sample Input 0

//  60
//  60
//  60
// Sample Output 0

// 1

import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input1 = scanner.nextInt();
        int input2 = scanner.nextInt();
        int input3 = scanner.nextInt();

        if(input1 + input2 + input3 == 180)
        {
            System.out.println(1);
        }else
        {
            System.out.println(0); 
        }
        scanner.close();

    }
    
}
