import java.util.Scanner;
class allpossiblesubstring{
	public static void main(String[] xyz){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string to find its all possible substrings");
		String str=sc.nextLine();
		for(int i=0;i<str.length();i++){
			for(int j=i+1;j<str.length()+1;j++){
				System.out.println(str.substring(i,j));
			}
		}
	}
}