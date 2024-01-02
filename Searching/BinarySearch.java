// Binary Search is defined as a searching algorithm used in a sorted array by repeatedly dividing the search interval in half. The idea of binary search is to use the information that the array is sorted and reduce the time complexity to O(log N). 

public class BinarySearch {
    public static int binarySearch(int[] arr,int target, int len){
        int start = 0;
        int end = len - 1;
        int mid = (end-start)/2;
        while(start<=end){
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid]<target){
                start = mid;
                mid = (end-start)/2;
            } else{
                end = mid;
                mid = (end-start)/2;
            }
        }
        return -1;
    }
    
    public static void main(String[] args){
        int[] arr = {10,2,34,1,0,5};
        int len = arr.length;
        System.out.println(binarySearch(arr,34,len));
    }
}
