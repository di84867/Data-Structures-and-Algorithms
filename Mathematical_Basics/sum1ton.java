import java.util.Scanner;
public class sum1ton {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum1ToN = 0;
        for(int i=1;i<=n;i++) {
            sum1ToN += i;
        }
        int arraySum = 0;
        for (int i = 0; i < n; i++) {
            arraySum += arr[i];
        }
        System.out.println("");
        System.out.println("The sum of numbers from 1 to " + n + " is: " + sum1ToN);
        System.out.println("Total sum of the array elements: " + arraySum);
        sc.close();
    }
}

