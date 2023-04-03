import java.util.*;

public class Currency{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Take input of the number of currency denominations
        System.out.println("Enter the number of currency denominations:");
        int n = sc.nextInt();
        
        // Take input of the currency denominations
        System.out.println("Enter the currency denominations:");
        int[] notes = new int[n];
        for (int i = 0; i < n; i++) {
            notes[i] = sc.nextInt();
        }
        
        // Sort the currency denominations in descending order
        Arrays.sort(notes);
        for (int i = 0; i < n / 2; i++) {
            int temp = notes[i];
            notes[i] = notes[n - i - 1];
            notes[n - i - 1] = temp;
        }
        
        // Take input of the amount to be paid
        System.out.println("Enter the amount to be paid:");
        int amount = sc.nextInt();
        
        // Calculate the minimum number of notes required to pay the amount
        int[] count = new int[n];
        for (int i = 0; i < n; i++) {
            count[i] = amount / notes[i];
            amount %= notes[i];
        }
        
        // Print the minimum number of notes required to pay the amount
        System.out.println("Your payment approach in order to give min no of notes will be:");
        for (int i = 0; i < n; i++) {
            if (count[i] != 0) {
                System.out.println(notes[i] + ":" + count[i]);
            }
        }
        sc.close(); // close the Scanner object to prevent resource leak
    }
}
