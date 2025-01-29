package interviewquestions;

public class Task07  {


    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 7, 11, 15, 5, 6, 8};
        int target = 9;

        ikiSayiyiTopla(nums, target);
    }
    public static void ikiSayiyiTopla(int[] nums, int target) {
        System.out.println("Indeksler : ");
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    System.out.print("Indeksler: [" + i + ", " + j + "] ");
                    System.out.print("Sayilar: [" + nums[i] + ", " + nums[j] + "] ");
                    System.out.println("-> Toplam: " + target);
                }
                }
            }
        }
    }

