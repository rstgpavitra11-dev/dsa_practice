import java.util.Arrays;

public class longestconsecutive {
    public static void main(String[] args) {
        int nums[] = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        Arrays.sort(nums);
        int current = nums[0];
        int highest = 1;
        for (int i : nums) {

            if (nums[i] == current) {

            } else if (nums[i] == ++current) {
                highest++;
            } else {
                highest = 0;
            }
        }
        System.out.println(highest);

    }
}
