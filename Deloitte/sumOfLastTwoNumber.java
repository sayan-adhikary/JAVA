/*Let me explain the problem clearly:
Problem: Sum of Last Two Numbers
Task:
Write a program that calculates the sum of the last two numbers in an array.
Input Format:

The first line contains an integer N, representing the size of the array
The second line contains N integers separated by spaces, representing the array elements

Constraints:

The array size N must be between 2 and 10000 (inclusive): 2 ≤ N ≤ 10000
Each array element must not exceed 10000
Input should be read from STDIN (Standard Input)
Output should be written to STDOUT (Standard Output)

Output Format:

Print a single integer: the sum of the last number and the second-to-last number in the array

Sample Input:
Copy3
10 20 30
Sample Output:
Copy50
Explanation:

In the sample input, N = 3, and the array is [10, 20, 30]
The last number is 30
The second-to-last number is 20
Their sum is 20 + 30 = 50 */



package Deloitte;
import java.util.Scanner;

public class sumOfLastTwoNumber {        //tc: O(n) sc: O(n)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read array size
        int n = scanner.nextInt();
        
        // Input validation
        if (n < 2 || n > 10000) {
            System.out.println("Invalid array size");
            return;
        }
        
        // Read array elements
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            
            // Input validation for array elements
            if (arr[i] > 10000) {
                System.out.println("Invalid array element");
                return;
            }
        }
        
        // Calculate sum of last and second-to-last elements
        int sum = arr[n-1] + arr[n-2];
        
        // Print output
        System.out.println(sum);
        
        scanner.close();
    }
}
