import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class MinCost {
    public static void main(String[] xyz) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements in an array");
        ArrayList<Integer> a = new ArrayList<>(); // this is ArrayList which is used to declare dynamic sized array
        while (sc.hasNextInt()) {
            a.add(sc.nextInt());
        }
        System.out.println("The entered array:-");
        for (int i = 0; i < a.size(); i++) {
            System.out.print(a.get(i) + " ");
        }
        System.out.println();
        Collections.sort(a, Collections.reverseOrder());
        System.out.println("The sorted array:-");
        for (int i = 0; i < a.size(); i++) {
            System.out.print(a.get(i) + " ");
        }
        System.out.println();
        int cost = 0;
        for (int i = 0; i < a.size(); i++) {
            cost += (i + 1) * a.get(i);
        }
        System.out.println("The minimum cost is:- " + cost);
    }
}