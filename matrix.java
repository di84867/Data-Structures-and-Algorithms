import java.util.Scanner;
class matrix{
    public void printMatrix(int a[][]){
        int rows=a.length;
        int cols=a[0].length;
        System.out.println("The Entered Matrix is:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    public void rowwisesum(int a[][]){
        int rows=a.length;
        int cols=a[0].length;
        for(int i=0;i<rows;i++){
            int total=0;
            for(int j=0;j<cols;j++){
                total+=a[i][j];
            }
            System.out.println("Sum of row "+i+" is:"+total);
        }
    }
    public void columnwiseSum(int a[][]){
        int rows=a.length;
        int cols=a[0].length;
        for(int i=0;i<cols;i++){
            int total=0;
            for(int j=0;j<rows;j++){
                total+=a[j][i];
            }
            System.out.println("Sum of column "+i+" is:"+total);
        }
    }
    public void diagonal(int a[][]){
        int rows=a.length;
        int cols=a[0].length;
        int r=0,c=0;
        while(r<rows && c<cols){
            System.out.println(a[r][c]+" ");
            r++;
            c++;
        }
    }
    public void antiDiagonal(int a[][]){
        int rows=a.length;
        int cols=a[0].length;
        int r=0,c=cols-1;
        while(r<rows && c>=0){
            System.out.println(a[r][c]+" ");
            r++;
            c--;
        }
    }
    public void transpose(int a[][]){
        int rows=a.length;
        int cols=a[0].length;
        int b[][]=new int[cols][rows];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                b[j][i]=a[i][j];
            }
        }
        printMatrix(b);
    }
    public void rotate(int a[][],int n,String dir){
        int rows=a.length;
        if (rows == 0 || a[0].length != rows) {
            return;
        }
        int rotations = (n / 90) % 4;
        if (dir.equalsIgnoreCase("anticlockwise") || dir.equalsIgnoreCase("anti-clockwise")) {
            rotations = (4 - rotations) % 4;
        }
        for (int rot = 0; rot < rotations; rot++) {
            for(int i=0;i<rows;i++){
                for(int j=i+1;j<rows;j++){
                    int temp=a[i][j];
                    a[i][j]=a[j][i];
                    a[j][i]=temp;
                }
            }
            for (int i = 0; i < rows; i++) {
                int left = 0;
                int right = rows - 1;
                while (left < right) {
                    int temp = a[i][left];
                    a[i][left] = a[i][right];
                    a[i][right] = temp;
                    left++;
                    right--;
                }
            }
        }
        System.out.println("The Matrix after rotation is:");
        printMatrix(a);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no of rows:");
        int rows=sc.nextInt();
        System.out.print("Enter the no of columns:");
        int cols=sc.nextInt();
        int a[][]=new int[rows][cols];
        System.out.println("Enter the elements of the matrix:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the degree to rotate (multiples of 90):");
        int n=sc.nextInt();
        System.out.println("Enter the direction (clockwise/anticlockwise):");
        String dir=sc.next();
        sc.close();
        matrix m=new matrix();
        m.printMatrix(a);
        m.rowwisesum(a);
        m.columnwiseSum(a);
        m.diagonal(a);
        m.antiDiagonal(a);
        m.transpose(a);
        m.rotate(a,n,dir);
    }
}