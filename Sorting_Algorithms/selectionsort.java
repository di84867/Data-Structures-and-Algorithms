import java.util.Scanner;
import java.util.ArrayList;

class selectionsort {
    public void ssort(ArrayList<Integer> arr){
        for (int i = 0; i < arr.size(); i++) {
            int min_idx = i;

            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(j) < arr.get(min_idx)) {
                    min_idx = j;
                }
            }
            int temp = arr.get(i);
            arr.set(i, arr.get(min_idx));
            arr.set(min_idx, temp);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<>();
        selectionsort ss=new selectionsort();
        System.out.println("Enter the elements in an array");
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            a.add(n);
        }
        System.out.println("The entered array is:-");
        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i) + " "); // get and set are used to access or update values of private variables.
        }
        ss.ssort(a);
        System.out.println("Sorted array is:-");
        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i) + " ");
        }
        sc.close();
    }
}