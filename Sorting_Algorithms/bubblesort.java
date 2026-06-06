import java.util.Scanner;
import java.util.ArrayList;

class bubblesort{
    public void bsort(ArrayList<Integer> arr){
        int n=arr.size();
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr.get(j)>arr.get(j+1)){
                    int temp=arr.get(j);
                    arr.set(j,arr.get(j+1));
                    arr.set(j+1,temp);
                }
            }
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> al=new ArrayList<>();
        bubblesort bs=new bubblesort();
        System.out.println("Enter the elements in an array:");
        while(sc.hasNextInt()){
            int n=sc.nextInt();
            al.add(n);
        }
        System.out.println("The Entered Array is:"+al);
        bs.bsort(al);
        System.out.println("The Sorted Array is:"+al);
        sc.close();
    }
}