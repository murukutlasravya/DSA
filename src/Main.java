//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        int nums[] = {1,5,6,8,9};
        int traget = 8;

        for(int i=0; i<nums.length; i++) {
            if(nums[i]==traget) {
                System.out.println("Target found at " +nums[i]);
            }
        }


    }
}