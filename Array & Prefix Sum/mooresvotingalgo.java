import java.util.*;

public class mooresvotingalgo {
    public static int findMajority(int[] arr) {
        int major = -1;
        int freq = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (freq == 0) {
                major = arr[i];
                freq = 1;
            } else if (major == arr[i]) {
                freq++;
            } else {
                freq--;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (major == arr[i]) {
                count++;
            }
        }
        if (count > arr.length / 2) {
            return major;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("Enter the elements in the array (enter a non-integer to stop):");
        while (sc.hasNextInt()) {
            arr.add(sc.nextInt());
        }
        System.out.println("The Entered Array is: " + arr);

        // Convert ArrayList<Integer> to int[]
        int[] nums = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            nums[i] = arr.get(i);
        }

        System.out.println("The Majority Element is: " + findMajority(nums));
        sc.close();
    }
}