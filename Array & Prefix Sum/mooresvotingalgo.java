import java.util.Scanner;
// Class to demonstrate Moore's Voting Algorithm
// The algorithm finds the majority element in an array (an element that appears more than n/2 times)
class mooresvotingalgo {
    public static void main(String[] args) {
        int count = 0;
        int major = -1; // Stores the candidate for the majority element
        int freq = 0; // Keeps track of the frequency of the current candidate
        int x;

        // Initialize Scanner to read input from the console
        Scanner sc = new Scanner(System.in);

        // Read the size of the array
        int n = sc.nextInt();
        int[] arr = new int[n];

        // PHASE 1: Find a candidate for the majority element
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); // Read the array elements
            x = arr[i];

            // If the frequency is 0, we assign the current element as the new candidate
            if (freq == 0) {
                major = x;
                freq = 1;
            }
            // If the current element matches the candidate, increment the frequency
            else if (x == major) {
                freq++;
            }
            // If it doesn't match, decrement the frequency (this cancels out non-majority
            // elements)
            else {
                freq--;
            }
        }

        // PHASE 2: Verify if the candidate is actually the majority element
        count = 0;
        for (int i = 0; i < n; i++) {
            // Count the actual occurrences of the candidate in the array
            if (major == arr[i]) {
                count++;
            }
        }

        // A majority element must appear more than n/2 times
        if (count > n / 2) {
            System.out.println(major); // It is the majority element
        } else {
            System.out.println("No majority element"); // It is not a majority element
        }

        // Close the scanner to prevent resource leaks
        sc.close();
    }
}