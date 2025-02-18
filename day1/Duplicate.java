import java.util.Arrays;

public class Duplicate {
    public static boolean hasDuplicate(int[] nums) {
        int len = nums.length;
        Arrays.sort(nums);
        for (int i = 1; i < len; i++) {
            if (nums[i] == nums[i - 1]) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // Test cases
        int[] test1 = {1, 2, 3, 4, 5};  
        int[] test2 = {1, 2, 3, 1};      
        int[] test3 = {5, 5, 5, 5};      
        int[] test4 = {};                
        int[] test5 = {10, 20, 30, 40};  

        // Running tests
        System.out.println(hasDuplicate(test1)); // false
        System.out.println(hasDuplicate(test2)); // true
        System.out.println(hasDuplicate(test3)); // true
        System.out.println(hasDuplicate(test4)); // false
        System.out.println(hasDuplicate(test5)); // false
    }
}
