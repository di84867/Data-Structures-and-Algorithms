import java.util.Scanner;
import java.util.ArrayList;
public class insertionsort {
    public static void insertionSort(int[] arr) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n=sc.nextInt();
        ArrayList<Integer> a=new ArrayList<>();
        System.out.println("Enter the elements in an array");
        for(int i=0;i<n;i++){
            a.add(sc.nextInt());
        }
        for (int i = 1; i < n; ++i) {
            int key = a.get(i);
            int j = i - 1;

            while (j >= 0 && a.get(j) > key) {
                a.set(j + 1, a.get(j));
                j = j - 1;
            }
            a.set(j + 1, key);
        } 
    }

    public static void main(String[] args) {
        insertionSort(arr);
        System.out.print("Sorted array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
