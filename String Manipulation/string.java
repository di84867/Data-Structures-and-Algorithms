import java.util.*;

class string {
    void switchcase(String str) {
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

    void longestsubstring(String str) {
        int ans = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                String sub = str.substring(i, j + 1);
                int len = sub.length();
                if (isPalindrome(sub)) {
                    ans = Math.max(ans, len);
                }
            }
        }
        System.out.println(ans);
    }

    void substring(String str) {
        int n = str.length();
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                String sub = str.substring(i, j + 1);
                System.out.println(sub);
            }
        }
    }

    void palindrome(String str) {
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

    boolean isPalindrome(String str) {
        int l = 0, r = str.length() - 1;
        while (l < r) {
            if (str.charAt(l) != str.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

    void evenlenpal(String str) {
        int ans = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                String sub = str.substring(i, j + 1);
                int len = sub.length();
                if (len % 2 == 0 && isPalindrome(sub)) {
                    ans = Math.max(ans, len);
                }
            }
        }
        System.out.println(ans);
    }

    void oddlenpal(String str) {
        int ans = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                String sub = str.substring(i, j + 1);
                int len = sub.length();
                if (len % 2 == 1 && isPalindrome(sub)) {
                    ans = Math.max(ans, len);
                }
            }
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        string s = new string();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String str = sc.nextLine();
        
        System.out.println("\nAll substrings:");
        s.substring(str);
        
        System.out.println("\nSwitch case:");
        s.switchcase(str);
        
        System.out.println("\nLongest palindromic substring length:");
        s.longestsubstring(str);
        
        System.out.println("\nPalindrome Check:");
        s.palindrome(str);
        
        System.out.println("\nMax even length palindrome:");
        s.evenlenpal(str);
        
        System.out.println("\nMax odd length palindrome:");
        s.oddlenpal(str);
        
        sc.close();
    }
}