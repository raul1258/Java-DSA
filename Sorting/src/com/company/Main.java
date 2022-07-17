package com.company;
import java.util.*;
import java.io.*;
import java.util.ArrayList.*;

public class Main {

    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
        //bubbleSort(arr);
      //  insertionSort(arr);
           // printArr(arr);
        quickSort(arr,true);
    }
    public static void quickSort(int arr[],boolean qs1){
        int pivot=arr[0];
        int countPivot=0;
        ArrayList<Integer>leftSubArray=new ArrayList<Integer>();
        ArrayList<Integer>rightSubArray=new ArrayList<Integer>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]>pivot){
                rightSubArray.add(arr[i]);
            }
            else if(arr[i]<pivot) {
            leftSubArray.add(arr[i]);
               }else if(pivot==arr[i]){
                countPivot++;
            }
            }
        if(qs1){
            for(int i=0;i<leftSubArray.size();i++){
                System.out.print(leftSubArray.get(i)+" ");
            }
            for(int i=0;i<countPivot;i++){
                System.out.print(pivot+" ");
            }
            for(int i=0;i<rightSubArray.size();i++){
                System.out.print(rightSubArray.get(i)+" ");
            }

        }


        }

    public static void bubbleSort(int arr[]){
    int n=arr.length;
    for(int i=n-1;i>=1;i--){
//        boolean flag=false;
        for(int j=0;j<=i-1;j++){
            if(arr[j]>arr[j+1]){
//                flag=true;
                int t=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=t;
            }
        }
//        if(!flag) {
//            break;
//        }
        }
    }
    public static void insertionSort(int arr[]){
        int n=arr.length;
        int j;
        for(int i = 1; i <= n - 1; i++){
            int curr = arr[i]; // element to be inserted
            for(j = i - 1; j >= 0; j--){
                if(curr < arr[j]){ // 6 2 3 4 1
                    // shift arr[j] to j + 1 index
                    arr[j + 1] = arr[j];
                }
                else{ // you have reached a number that is <= curr. It means all nos to the left of arr[j] are gonna smaller than curr.
                    break;
                }
            }
            arr[j + 1] = curr;
        }
    }
    static void printArr(int arr[]){
    int n=arr.length;
    for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
    }
    }
}
