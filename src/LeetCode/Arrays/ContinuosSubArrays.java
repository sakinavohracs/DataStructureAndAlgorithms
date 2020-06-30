package LeetCode.Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ContinuosSubArrays {
    public static void main(String[] args) {
       System.out.println(subArrays(new int[] { 1,1,1 }, 2));
    }

    //print list of all sub arrays
    public static int subArrays(int[] arr, int target){

        Map<Integer,Integer> map = new HashMap<>();
        Map<Integer,Integer> pos = new HashMap<>();
        Map<Integer,Integer> indices = new HashMap<>();
        List<Integer> integers = new ArrayList<>();

        int count = 0;
        int sum = 0;
        map.put(0,1);
        for(int i =0; i< arr.length;i++){
            sum += arr[i];


            if(map.containsKey(sum - target)){

                count += map.get(sum-target);
               // System.out.println("1 " + map.get(sum-target));
            }

            map.put(sum, map.getOrDefault(sum,0)+1);
        }
        for(Integer i : map.values()){
            System.out.println(i);
        }
        return count;
    }


}
