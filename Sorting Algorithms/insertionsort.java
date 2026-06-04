import java.util.Scanner;
import java.util.ArrayList;
class insertionsort{
    public void isort(ArrayList<Integer> arr){
        for(int i=1;i<arr.size();i++){
            int x=arr.get(i);
            int j=i-1;
            while(j>=0&&arr.get(j)>x){
                arr.set(j+1, arr.get(j));
                j--;
            }
            arr.set(j+1, x);
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> al=new ArrayList<>();
        insertionsort is=new insertionsort();
        System.out.println("Enter the elements in an array");
        while(sc.hasNextInt()){
            int n=sc.nextInt();
            al.add(n);
        }
        System.out.println("The Entered Array is:"+al);
        is.isort(al);
        System.out.println("The Sorted Array is:"+al);
        sc.close();
    }
}