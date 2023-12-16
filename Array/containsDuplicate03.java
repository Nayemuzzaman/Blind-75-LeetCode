package Array;

import java.util.HashSet;

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
