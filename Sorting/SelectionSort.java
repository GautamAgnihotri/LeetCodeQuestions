package Sorting;

import java.util.Scanner;

public class SelectionSort {
    public static void selectionSort(int[] arr, int len){
        for(int i=0;i<len;i++){
            int index = i;
            for(int j=i+1;j<len;j++){
                if(arr[j]<arr[index]){
                    index = j;
                }
            }
            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }
    }
     public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int len = scn.nextInt();
        int[] arr  = new int[len];
        for(int i=0;i<len;i++){
            arr[i] = scn.nextInt();

        }
        selectionSort(arr, len);
        for(int a: arr){
            System.out.print(a+" ");
        }
    }
}
