/**
 * This class provides a method to remove duplicates from a sorted integer array.
 * The duplicates are removed in-place, preserving the relative order of unique elements.
 * It returns the number of unique elements in the modified array.
 */
public class RemoveDuplicatesFromSortedArray {

    /**
     * Removes duplicates from a sorted array in-place.
     *
     * @param nums A non-decreasing sorted integer array
     * @return The number of unique elements (k), with the first k positions of the array updated
     */
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int i = 0; // 'i' acts as the slow pointer indicating the last position of unique values

        for (int j = 1; j < nums.length; j++) {
            // Only update when a new unique element is found
            if (nums[i] != nums[j]) {
                i++;             // Move the slow pointer forward
                nums[i] = nums[j]; // Copy the new unique element forward
            }
        }

        return i + 1; // The count of unique elements is 'last index + 1'
    }

    public static void main(String[] args) {
        // Sample sorted arrays with duplicates
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int[] nums_1 = {1, 1};

        int k = removeDuplicates(nums_1);

        // Output the number of unique elements
        System.out.println("k = " + k);

        // Print only the first k elements (the unique values)
        System.out.print("Modified array: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums_1[i] + " ");
        }
    }
}