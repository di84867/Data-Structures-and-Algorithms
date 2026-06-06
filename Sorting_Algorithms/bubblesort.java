import java.util.Scanner;
import java.util.ArrayList;

class bubblesort {
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> al = new ArrayList<>();

    public void bsort(ArrayList<Integer> arr) {
        int temp = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.size() - i - 1; j++) {
                if (arr.get(j) > arr.get(j + 1)) {
                    temp = arr.get(j);
                    arr.set(j, arr.get(j + 1));
                    arr.set(j + 1, temp);
                }
            }
        }
    }

    public static void main(String[] xyz) {
        bubblesort bs = new bubblesort();
        System.out.println("Enter the elements in an array");
        while (bs.sc.hasNextInt()) {
            bs.al.add(bs.sc.nextInt());
        }
        System.out.println("The entered array is: " + bs.al);
        bs.bsort(bs.al);
        System.out.println("The sorted array is: " + bs.al);
        bs.sc.close();
    }
}