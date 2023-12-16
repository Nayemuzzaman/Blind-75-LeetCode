package Array;

import java.util.HashSet;
/**
 * 217. Contains Duplicate
 * Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
 * Example 1:
 *
 * Input: nums = [1,2,3,1]
 * Output: true
 * Example 2:
 *
 * Input: nums = [1,2,3,4]
 * Output: false
 * Example 3:
 *
 * Input: nums = [1,1,1,3,3,4,3,2,4,2]
 * Output: true
* */
class containsDuplicate03 {
    public static boolean containsDuplicate(int[] nums) {

        HashSet<Integer> dups = new HashSet<Integer>();
        for (int n: nums){
            if (dups.contains(n)){
                return true;
            }else {
                dups.add(n);
            }
        }
        return false;

    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        System.out.println(containsDuplicate(nums));
    }
}
