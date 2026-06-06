import java.util.*;

class SwitchCase {
    static void switchcase(String str) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32); // in place of this we can use Character.toUpperCase(ch)
            } else if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32); // in place of this we can use Character.toLowerCase(ch)
            }
            System.out.print(ch);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String str = sc.nextLine();

        System.out.println("Switch case:");
        switchcase(str);

        sc.close();
    }
}
