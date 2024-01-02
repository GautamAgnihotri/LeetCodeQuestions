// Given a zero-based permutation nums (0-indexed), build an array ans of the same length where ans[i] = nums[nums[i]] for each 0 <= i < nums.length and return it.

package Arrays;
class ArrayForPermutation1920 {
    public static int[] buildArray(int[] nums) {
        int[] arr = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i] = nums[nums[i]];
        }
        return arr;
    }
    public static void main(String[] args){
        int[] arr = {0,2,1,5,3,4};
        int[] resArray = buildArray(arr);
        for(int a:resArray){
            System.out.println(a);
        }
    }
}