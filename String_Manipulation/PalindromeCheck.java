import java.util.*;

class PalindromeCheck {
    static void palindrome(String str) {
        int l = 0, r = str.length() - 1;
        while (l < r) {
            if (str.charAt(l) != str.charAt(r)) {
                break;
            }
            l++;
            r--;
        }
        if (l >= r) {
            System.out.println(str + " is a palindrome");
        } else {
            System.out.println(str + " is not a palindrome");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String str = sc.nextLine();

        System.out.println("Palindrome Check:");
        palindrome(str);

        sc.close();
    }
}
