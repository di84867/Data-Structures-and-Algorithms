import java.util.Scanner;

class MinCost {
    public static void main(String[] xyz) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in array: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements in an array");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 1; i < n; i++) {
            if (a[i] < a[i + 1]) {
                int temp = a[i];
                a[i] = a[i + 1];
                a[i + 1] = temp;
            }
        }
        int cost = 0;
        for (int i = 1; i <= n; i++) {
            cost += (i + 1) * a[i];
        }
        System.out.println("The cost of deleting the array is: " + cost);
        sc.close();
    }
}