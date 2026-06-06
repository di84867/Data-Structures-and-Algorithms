import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

class allpossiblesubstring {
    public static void getSubstring(String str, int i, int j, List<String> substrings) {
        if (i == str.length()) {
            return;
        }
        substrings.add(str.substring(i, j));
        if (j == str.length()) {
            getSubstring(str, i + 1, i + 2, substrings);
        } else {
            getSubstring(str, i, j + 1, substrings);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to find its all possible substrings");
        String str = sc.nextLine();
        List<String> substrings = new ArrayList<>();
        getSubstring(str, 0, 1, substrings);
        System.out.println(substrings);
        sc.close();
    }
}