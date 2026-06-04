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
        int n = a.size();
        for (int i = 0; i < n; i++) {
            int temp = a.get(i);
            int lastIdx = i;
            while (lastIdx + 1 < n && a.get(lastIdx + 1) == temp) {
                lastIdx++;
            }
            int countGreater = n - 1 - lastIdx;
            if (temp == countGreater) {
                ans++;
            }
        }
        System.out.println("The number of noble integers is:- ");
        System.out.println(ans);
        sc.close();
    }
}