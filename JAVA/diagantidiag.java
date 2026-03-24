import java.util.Scanner;
class diagantidiag{
    static void printdiagonal(int[][]a){
        int n=a.length;
        int m=a[0].length;
        int r=0,c=0;
        while(r<n && c<m){
            System.out.println(a[r][c]);
            r++;
            c++;
        }
    }
    static void printantidiagonal(int[][]a){
        int n=a.length;
        int m=a[0].length;
        int r=0,c=m-1;
        while(r<n && c>=0){
            System.out.println(a[r][c]);
            r++;
            c--;
        }
    }
    public static void main(String[] xyz){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of matrix");
        int size=sc.nextInt();
        int a[][]=new int[size][size];
        System.out.println("Enter the elements in the matrix:");    
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("The Entered Matrix is:");
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("The Diagonal Elements are:");
        printdiagonal(a);
        System.out.println("The Anti-Diagonal Elements are:");
        printantidiagonal(a);
    }
}