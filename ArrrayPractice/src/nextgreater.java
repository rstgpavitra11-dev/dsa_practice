public class nextgreater {
    public static void main(String[] args) {
        int nums1[] = {4, 1, 2};
        int nums2[] = {1, 3, 4, 2};
        int[] ans = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            int target = nums1[i];
            int foundIdx = -1;

            for (int j = 0; j < nums2.length; j++) {
                if (nums2[j] == target) {
                    foundIdx = j;
                    break;
                }
            }
            int nextGreater = -1;
            for (int k = foundIdx + 1; k < nums2.length; k++) {
                if (nums2[k] > target) {
                    nextGreater = nums2[k];
                    break;
                }
            }

            // Step 3: Store the result
            ans[i] = nextGreater;
        }

        // Print the results
        for (int x : ans) {
            System.out.print(x + " "); // Output: -1 3 -1
        }
    }
}

