import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

class maxconsecutives {
    public int maxcons1(ArrayList<Integer> a) {
        int n = a.size();
        if (n == 0) return 0;
        int total1s = 0;
        for (int x : a) if (x == 1) total1s++;
        if (total1s == n || total1s == 0) return total1s;

        int[] left = new int[n];
        int[] right = new int[n];

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (a.get(i) == 1) count++;
            else {
                left[i] = count;
                count = 0;
            }
        }
        count = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (a.get(i) == 1) count++;
            else {
                right[i] = count;
                count = 0;
            }
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (a.get(i) == 0) {
                int combined = left[i] + right[i];
                if (combined < total1s) {
                    ans = Math.max(ans, combined + 1);
                } else {
                    ans = Math.max(ans, combined);
                }
            }
        }
        // Also check current max without swap
        int current = 0;
        for (int x : a) {
            if (x == 1) {
                current++;
                ans = Math.max(ans, current);
            } else {
                current = 0;
            }
        }
        return ans;
    }

    public int maxcons0(ArrayList<Integer> a) {
        int n = a.size();
        if (n == 0) return 0;
        int total0s = 0;
        for (int x : a) if (x == 0) total0s++;
        if (total0s == n || total0s == 0) return total0s;

        int[] left = new int[n];
        int[] right = new int[n];

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (a.get(i) == 0) count++;
            else {
                left[i] = count;
                count = 0;
            }
        }
        count = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (a.get(i) == 0) count++;
            else {
                right[i] = count;
                count = 0;
            }
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (a.get(i) == 1) {
                int combined = left[i] + right[i];
                if (combined < total0s) {
                    ans = Math.max(ans, combined + 1);
                } else {
                    ans = Math.max(ans, combined);
                }
            }
        }
        int current = 0;
        for (int x : a) {
            if (x == 0) {
                current++;
                ans = Math.max(ans, current);
            } else {
                current = 0;
            }
        }
        return ans;
    }

    public static void main(String[] xyz) {
        System.out.println("Enter Elements in an array only 0 and 1");
        ArrayList<Integer> a = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            a.add(sc.nextInt());
        }
        maxconsecutives s = new maxconsecutives();
        System.out.println("The Max Consecutive 0's (with 1 swap) is " + s.maxcons0(a));
        System.out.println("The Max Consecutive 1's (with 1 swap) is " + s.maxcons1(a));
    }
}