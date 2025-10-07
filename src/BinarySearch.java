import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class BinarySearch {

    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<Integer>();

        System.out.println("Enter size of array: ");
         Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        for(int i=0; i<size; i++) {
            System.out.println("Enter number "+(i+1)+": ");
            nums.add(sc.nextInt());
        }

        System.out.println("Entered values: ");
        System.out.println(nums);
        Collections.sort(nums);
        System.out.println("Sorted Values: ");
        System.out.println(nums);

        System.out.println("Enter target: ");

        int target = sc.nextInt();

        int index = binarySearch(nums, target);

        if(index==-1)
            System.out.println("Target not found");
        else
            System.out.println("Target found at index "+ index + " in sorted array");

        sc.close();

    }

    private static int binarySearch(ArrayList<Integer> nums, int target) {

        int start = 0, end = nums.size() - 1;

        while(start <= end) {
           int mid = (end + start) / 2;
            if(target == nums.get(mid))
                return mid;
            else if (target < nums.get(mid)){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

}
