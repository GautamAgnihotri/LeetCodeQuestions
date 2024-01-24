// 1929. Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).

// Specifically, ans is the concatenation of two nums arrays.

// Return the array ans.
package Arrays;

import java.util.Scanner;

public class arrConcatination {
    public static int[] getConcatenation(int[] nums) {
        int len = nums.length;
        int newlen = len*2;
        int arr[] = new int[newlen];
        // Approach 1;
        // for(int i=0;i<len;i++){
        //     int idx=i%nums.length;
        //     arr[i] = nums[idx];
        // }

        // Approach 2;
        for(int i=0;i<len;i++){
            arr[i]=nums[i];
            arr[i+len]=nums[i];
        }

        return arr;
    }

    public static void main(String[] args ){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        arr = getConcatenation(arr);
        for(int a:arr){
            System.out.println(a);
        }
    }
}
