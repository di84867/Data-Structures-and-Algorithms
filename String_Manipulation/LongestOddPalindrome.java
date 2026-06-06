import java.util.*;

class LongestOddPalindrome {
    static boolean isPalindrome(String str) {
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

    static void oddlenpal(String str) {
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
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String str = sc.nextLine();

        System.out.println("Max odd length palindrome:");
        oddlenpal(str);

        sc.close();
    }
}
