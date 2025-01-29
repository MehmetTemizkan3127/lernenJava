package interviwquestions;

import java.util.Arrays;

import static interviwquestions.Task02.findDuplicates;

public class Task05 {
    public static void main(String[] args) {
        int[] nums = {4, 5,5,8, 6, 7, 4, 6, 8,8,8};
        findDuplicates(nums);
    }

    public static void findDuplicates(int[] nums) {

        Arrays.sort(nums);


        int count = 1;


        for (int i = 0; i < nums.length - 1; i++) {

            if (nums[i] == nums[i + 1]) {
                count++;
            } else {

                if (count > 1) {
                    System.out.println(nums[i] + " " + count + " defa tekrar ediyor.");
                }
                count = 1;
            }
        }

        if (count > 1) {
            System.out.println(nums[nums.length - 1] + " " + count + " defa tekrar ediyor.");
        }
    }
}