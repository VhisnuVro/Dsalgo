import java.util.Scanner;

// You are given a Bank account having N amount and you are asked to perform ADD(credit) or SUBTRACT(debit) operation of an amount X.

// After the operation print the amount left in the Bank account. If the debit amount is greater than current balance print "Insufficient Funds"(without quotes) and the operation is skipped.

// Input Format

// First line contains a single integer N denoting the balance in bank account.

// Next line contains two space separated integers Type and Amount(X).

// If Type == 1, Perform ADD operation. If Type == 2, Perform SUBTRACT operation.

// Constraints

// 1 <= N, X <= 10^5

// Output Format

// Print Amount in the bank balance after the operation.

// Sample Input 0

// 1000
// 1 500
// Sample Output 0

// 1500

public class Problem6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance = scanner.nextInt();
        int type = scanner.nextInt();
        int amount = scanner.nextInt();

        if (type == 1) {
            balance += amount;
        } else if (type == 2) {
            if (amount > balance) {
                System.out.println("Insufficient Funds");
            } else {
                balance -= amount;
            }
        }
        if (type == 2 && amount <= balance) {
            System.out.println(balance);
        } else if (type == 1) {
            System.out.println(balance);
        }

        scanner.close();
    
    }
}
