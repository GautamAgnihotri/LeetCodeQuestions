package Arrays;

import java.util.HashMap;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
    HashMap<Integer, Integer> myMap = new HashMap<>();
    int[] arr = new int[2];
    int len = nums.length;
    for(int i=0;i<len;i++){
        int currNum = nums[i];
        if(!myMap.containsKey(currNum)){
            myMap.put(target-currNum,i);
        }else{
            arr[0] = i;
            arr[1] = myMap.get(currNum);
        } 
    }
    return arr;  
    }

    public static void main(String[] args){
        int[] arr = {10,2,34,1,0,5,6};
        int target = 36;
        int[] resArray = twoSum(arr,target);
        for(int a:resArray){
            System.out.println(a);
        }
    }
    
}
