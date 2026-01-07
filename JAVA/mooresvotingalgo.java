import java.util.Scanner;
class mooresvotingalgo{
    public static void main(String[] args) {
        int count=0;
        int major=-1;
        int freq=0;
        int x;

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            x=arr[i];
            if(freq==0){    
                major=x;
                freq=1;
            }
            else if(x==major){
                freq++;
            }
            else{
                freq--;
            }
        }
        count=0;
        for(int i=0;i<n;i++){
            if(major==arr[i]){
                count++;
            }
        }
        if(count>n/2){
            System.out.println(major);
        }
        else{
            System.out.println("No majority element");
        }
        sc.close();
    }
}