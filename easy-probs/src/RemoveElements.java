/**
 * Class: RemoveElement
 * Problem: 27. Remove Element
 * This class provides an in-place algorithm to remove all occurrences
 * of a given value from an integer array. It uses the two-pointer technique
 * to overwrite unwanted elements and returns the length of the array after removal.
 * Time Complexity:  O(n) — single pass over the array
 * Space Complexity: O(1) — no extra space besides a couple of integers
 */
public class RemoveElements {

    /**
     * Removes all instances of val in nums by shifting non-val elements forward.
     *
     * @param nums Input array of integers (will be modified in-place)
     * @param val  Value to remove from the array
     * @return The new length (k) of the array after removal. The first k entries
     *         of nums will contain the retained elements.
     */
    public static int removeElement(int[] nums, int val) {
        // i = next write position for a non-val element
        int i = 0;

        // j = current read position scanning through the array
        for (int j = 0; j < nums.length; j++) {
            // If current element is NOT the one to remove,
            // copy it to index i and advance i.
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
            // If nums[j] == val, we simply skip it.
            // j continues forward, and i stays put, 
            // effectively overwriting this slot later.
        }

        // i now holds the count of elements != val
        return i;
    }

    public static void main(String[] args) {
        // Example 1
        int[] nums1 = {3, 2, 2, 3};
        int val1   = 3;
        int k1     = removeElement(nums1, val1);
        System.out.println("After removing " + val1 + ", new length = " + k1);
        System.out.print("Modified array: ");
        for (int idx = 0; idx < k1; idx++) {
            System.out.print(nums1[idx] + " ");
        }
        System.out.println("\n");

        // Example 2
        int[] nums2 = {0, 1, 2, 2, 3, 0, 4, 2};
        int val2   = 2;
        int k2     = removeElement(nums2, val2);
        System.out.println("After removing " + val2 + ", new length = " + k2);
        System.out.print("Modified array: ");
        for (int idx = 0; idx < k2; idx++) {
            System.out.print(nums2[idx] + " ");
        }
        System.out.println();
    }
}