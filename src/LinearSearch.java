import java.util.ArrayList;
import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int length = Integer.parseInt(sc.nextLine());

        ArrayList<Integer> nums = new ArrayList<Integer>();
        for(int i=0;i<length;i++){
            System.out.println("Enter the element to be searched");
            nums.add(i, Integer.parseInt(sc.nextLine()));
        }

        System.out.println("Enter the target element to be searched");
        int target = Integer.parseInt(sc.nextLine());

        int result = linearSearch(nums, target);

        if(result!=-1)
            System.out.println("Target found at index "+ result);
        else
            System.out.println("Target not found");
    }

    private static int linearSearch(ArrayList<Integer> nums, int target) {

        for(int i=0;i<nums.size();i++) {
            if(nums.get(i) == target) {
                return i;
            }
        }
        return -1;
    }
}
