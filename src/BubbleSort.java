import java.util.ArrayList;
import java.util.Scanner;

public class BubbleSort {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();
        ArrayList<Integer> nums = new ArrayList<Integer>();
        for (int i = 0; i < size; i++) {
            System.out.println("Enter element: ");
            nums.add(sc.nextInt());
        }

        System.out.println("Given array: ");
        System.out.println(nums);

        //Sort the array
        ArrayList sortedArray = bubbleSort(nums);

        System.out.println(sortedArray);
    }

    private static ArrayList bubbleSort(ArrayList<Integer> nums) {

        //Time Complexity is 0(n^2) as there are 2 loops
        int temp = 0;
        for(int i =0; i<nums.size();i++)
        {
            for(int j =0; j<nums.size()-i-1;j++)
            {
                if(nums.get(j)>nums.get(j+1))
                {
                   // Collections.swap(nums, j, j+1);
                    temp = nums.get(j);
                    nums.set(j, nums.get(j+1));
                    nums.set(j+1, temp);
                }
            }
        }

        return nums;

    }
}
