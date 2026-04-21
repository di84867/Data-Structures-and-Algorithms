import java.util.Scanner;
import java.util.ArrayList;
class selectionsort{
    public static void main(String[] xyz){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n=sc.nextInt();
        int min_val;
        int min_idx;
        ArrayList<Integer> a=new ArrayList<>();
        System.out.println("Enter the elements in an array");
        for(int i=0;i<n;i++){
            a.add(sc.nextInt()); //inserts element into a datastructure like arraylist etc.
        }
        System.out.println("The entered array is:-");
        for(int i=0;i<a.size();i++){
            System.out.println(a.get(i)+" "); //get and set are used to access or update values of private variables.
        }
        for(int i=0;i<a.size()-1;i++){
            min_val=a.get(i);
            min_idx=i;
            
            for(int j=i+1;j<a.size();j++){
                if(a.get(j)<min_val){
                    min_val=a.get(j);
                    min_idx=j;
                }
            }
            
            int temp=a.get(i);
            a.set(i,a.get(min_idx));
            a.set(min_idx,temp);
        }
        System.out.println("Sorted array is:-");
        for(int i=0;i<a.size();i++){
            System.out.println(a.get(i)+" ");
        }
    }
}