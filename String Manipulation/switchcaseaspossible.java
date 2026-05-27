import java.util.Scanner;
class switchcaseaspossible{
    public static void main(String[] xyz){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character");
        char ch=sc.next().charAt(0);
        int asciivalue = (int)ch;
        if(asciivalue>=65 && asciivalue<=90){
            asciivalue=asciivalue+32;
        }else if(asciivalue>=97 && asciivalue<=122){
            asciivalue=asciivalue-32;
        }
        System.out.println("After switch between cases the final answer is:-"+(char)(asciivalue));
        sc.close();
    }
}