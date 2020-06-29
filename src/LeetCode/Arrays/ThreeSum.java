package LeetCode.Arrays;

import javafx.util.Pair;

import java.util.*;
//546 ms.
public class ThreeSum {
    public static void main(String[] args) {
        System.out.println(threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
    }


        public static List<List<Integer>> threeSum(int[] nums) {
            // [-1, 0, 1, 2, -1, -4]
            List<List<Integer>> res = new ArrayList<>();
            Set<Pair> found = new HashSet<>();
            Set<Integer> dups = new HashSet<>();
            Map<Integer, Integer> seen = new HashMap<>();
            for (int i = 0; i < nums.length; ++i){
                // nums[i] = -1
                //set.add returns false if element already present else true and adds the element
                if (dups.add(nums[i])){
                    //loop starting next element of i
                    for (int j = i + 1; j < nums.length; ++j) {
                        // nums[j] = 0
                        // comp = -(-1)-0 = 1
                        int complement = -nums[i] - nums[j];
                        if (seen.containsKey(complement) && seen.get(complement) == i) {
                            int v1 = Math.min(nums[i], Math.min(complement, nums[j]));
                            int v2 = Math.max(nums[i], Math.max(complement, nums[j]));
                            if (found.add(new Pair(v1, v2)))
                                res.add(Arrays.asList(nums[i], complement, nums[j]));
                        }
                        seen.put(nums[j], i);
                    }

                }

            }
            return res;
        }
    }

