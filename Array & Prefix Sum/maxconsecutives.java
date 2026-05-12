import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
class maxconsecutives{
    public static int maxcons0(int arr[]){
        int max=0;
        int cons=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                cons++;
            }else{
                max=Math.max(max,cons);
                cons=0;
            }
        }
        return Math.max(max,cons);  
    }
    public static int maxcons1(int arr[]){
        int max=0;
        int cons=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                cons++;
            }else{
                max=Math.max(max,cons);
                cons=0;
            }
        }
        return Math.max(max,cons);  
    }
    public static void main(String[] xyz){
        ArrayList<Integer> arr=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array elements separated by spaces: ");
        while(sc.hasNextInt()){
            arr.add(sc.nextInt());
        }
        int []n=new int[arr.size()];
        for(int i=0;i<arr.size();i++){
            n[i]=arr.get(i);
        }
        System.out.println("Maximum Consecutives 0's in the given array are:-"+maxcons0(n));
        System.out.println("Maximum Consecutives 1's in the given array are:-"+maxcons1(n));
        sc.close();
    }
}