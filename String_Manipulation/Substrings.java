import java.util.*;

class Substrings {
    static void substring(String str) {
        int n = str.length();
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                String sub = str.substring(i, j + 1);
                System.out.println(sub);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String str = sc.nextLine();

        System.out.println("All substrings:");
        substring(str);

        sc.close();
    }
}
