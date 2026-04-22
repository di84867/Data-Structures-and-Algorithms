import java.util.Scanner;
class palstring{
    public static void main(String[] xyz){
        try (Scanner sc = new Scanner(System.in)) {
            String str=sc.nextLine();
            int l=0,r=str.length()-1;
            while(l<r){
                if(str.charAt(l)!=str.charAt(r)){
                    System.out.println("Not a palindrome");
                    return;
                }
                l++;
                r--;
            }
            System.out.println("Palindrome");
            sc.close();
        }
    }

}