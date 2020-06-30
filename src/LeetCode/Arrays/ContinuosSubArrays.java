package LeetCode.Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class ContinuosSubArrays {
    public static void main(String[] args) {
       System.out.println(subArrays(new int[] { 1,1,1}, 2));
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
//        indices.put(0,0);






        for(int i =0; i< arr.length;i++){
         sum += arr[i];
            if(i==0){
                if ((arr[i] + arr[i+1]) == target){
                    System.out.println("indices" + i+ "," + (i+1));
                }
            }
            if(indices.containsKey(sum-target)){
                int val = indices.get(sum-target);
                System.out.println("indices" + (val+1) + "," + i);
            }
            if(map.containsKey(sum - target)){

                count += map.get(sum-target);
            }

            map.put(sum, map.getOrDefault(sum,0)+1);

            indices.put(sum,i);




        }
        map.forEach((k,v) -> System.out.println(k + " " + v ));
        indices.forEach((k,v) -> System.out.println(k + " " + v ));



        return count;
    }


}
