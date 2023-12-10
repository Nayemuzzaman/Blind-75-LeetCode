package Array;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoSum01 {
    public static int[] twoSum(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i<nums.length;i++){
            int complement = target - nums[i];

            if (map.containsKey(complement)){
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};

    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i <n; i++){
            nums[i] = scanner.nextInt();
        }
        int target = scanner.nextInt();
        int[] Storage = twoSum(nums, target);
        System.out.print("Output: ["+Storage[0]+", "+Storage[1] + "]");

    }
}
