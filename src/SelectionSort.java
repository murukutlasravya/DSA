import java.util.ArrayList;
import java.util.Scanner;

public class SelectionSort {

    public ArrayList<Integer> selectionSort(ArrayList<Integer> nums) {

        int min;
        int minIndex;
        int temp;
        for(int i = 0; i < nums.size(); i++) {
            min =nums.get(i);
            minIndex = i;
            for(int j = i+1; j < nums.size(); j++) {
                if(min > nums.get(j)) {
                    min = nums.get(j);
                    minIndex = j;
                }
            }

            //Collections.swap(nums, minIndex, i);
            temp = nums.get(i);
            nums.set(i, nums.get(minIndex));
            nums.set(minIndex,temp);
        }

        return nums;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();

        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            System.out.println("Enter number: ");
            nums.add(sc.nextInt());
        }

        System.out.println("Original array: ");
        System.out.println(nums);

        SelectionSort selectionSort = new SelectionSort();
        ArrayList<Integer> sortedList = selectionSort.selectionSort(nums);
        System.out.println("Sorted array: ");
        System.out.println(sortedList);
    }

}
