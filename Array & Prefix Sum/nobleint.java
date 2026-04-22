import java.util.*;

class nobleint {
    public static void main(String[] xyz) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements in an array");
        ArrayList<Integer> a = new ArrayList<>();
        while (sc.hasNextInt()) {
            a.add(sc.nextInt());
        }
        System.out.println("The entered array:-");
        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i) + " ");
        }
        Collections.sort(a);
        System.out.println("The sorted array:-");
        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i) + " ");
        }
        int ans = 0;
        for (int i = 0; i < a.size(); i++) {
            if (i == a.get(i)) {
                ans += 1;
            }
        }
        System.out.println("The number of noble integers is:- ");
        System.out.println(ans);
    }
}