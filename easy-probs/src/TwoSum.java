import java.util.HashMap;

/**
 * Problem: Two Sum
 * Given an integer array and a target value, return the indices of the two numbers
 * that add up to the target.
 * <p>
 * Assumption: Exactly one solution exists. The same element cannot be used twice.
 */
public class TwoSum {

    /**
     * This method returns the indices of the two numbers in the array
     * that sum up to the target value.
     *
     * @param nums   Array of integers
     * @param target The target sum
     * @return An array of two indices that add up to target, or empty array if no solution
     */
    public static int[] twoSum(int[] nums, int target) {
        // A HashMap to store (number → index) mappings
        HashMap<Integer, Integer> map = new HashMap<>();

        // Iterate through the array once
        for (int i = 0; i < nums.length; i++) {
            // Calculate the number needed to reach the target sum
            int valueToFind = target - nums[i];

            // If the complement exists in the map, return its index and current index
            if (map.containsKey(valueToFind)) {
                return new int[]{map.get(valueToFind), i};
            }

            // If not found, store the current number and its index in the map
            map.put(nums[i], i);
        }

        // If no valid pair is found (though the problem guarantees one), return an empty array
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(nums, target);

        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}