package Sorting;

import java.util.Scanner;

public class BubbleSort {
    public static void bubbleSort(int[] arr,int len){
        for(int i=0;i<len;i++){
            for(int j=1;j<len-i;j++){
                if(arr[j-1]>arr[j]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int len = scn.nextInt();
    int[] arr  = new int[len];
    for(int i=0;i<len;i++){
        arr[i] = scn.nextInt();

    }
    bubbleSort(arr,len);
    for(int a: arr){
        System.out.print(a+" ");
    }
    }
}

