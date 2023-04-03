import java.util.Scanner;

public class Transaction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Get the size of the transaction array
        System.out.println("Enter the size of transaction array:");
        int n = sc.nextInt();
        
        // Initialize the transaction array
        int[] transactions = new int[n];
        
        // Get the transaction values from the user
        System.out.println("Enter the values of array:");
        for (int i = 0; i < n; i++) {
            transactions[i] = sc.nextInt();
        }
        
        // Get the total number of targets to achieve
        System.out.println("Enter the total no of targets that needs to be achieved:");
        int numTargets = sc.nextInt();
        
        // Loop through each target value and check if it is achievable
        for (int i = 0; i < numTargets; i++) {
            System.out.println("Enter the value of target:");
            int target = sc.nextInt();
            
            // Initialize variables to track the sum and the number of transactions
            int sum = 0;
            int numTransactions = 0;
            
            // Loop through each transaction and add it to the sum
            for (int j = 0; j < n; j++) {
                sum += transactions[j];
                numTransactions++;
                
                // If the sum is greater than or equal to the target, print the number of transactions
                if (sum >= target) {
                    System.out.println("Target achieved after " + numTransactions + " transactions");
                    break;
                }
            }
            
            // If the sum never exceeded the target, print that the target was not achieved
            if (sum < target) {
                System.out.println("Given target is not achieved");
            }
        }
        
        sc.close();
    }
}
