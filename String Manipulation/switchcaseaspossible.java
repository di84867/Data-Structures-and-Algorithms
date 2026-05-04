import java.util.Scanner;
class switchcaseaspossible{
    public static void main(String[] xyz){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character")
        char ch=sc.next().charAt(0);
        int asciivalue(int)ch;
        if(asciivalue>64 && asciivalue<90){
            int asciivalue=(int)ch+97;
        }elseif(asciivalue>97 && asciivalue<122){
            int asciivalue=(int)ch-97;
        }
        System.out.println("After switch between cases the final answer is:-"+(asciivalue));
        sc.close();
    }
}