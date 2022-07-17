package com.company;
import java.util.*;
import java.io.*;
public class Main {

    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int target=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
        int z=binarySearch(arr,target);
        System.out.println(z);
    }
    public static int binarySearch(int arr[],int target){
        int n=arr.length;
        int lo=0;
        int hi=n-1;
        int mid=0;
        while(lo<=hi){
            mid=lo+(hi-lo)/2;
            if(arr[mid]==target) {
              return mid;
              }else if(arr[mid]<target){
                lo=mid+1;
            }else{
                hi=mid+1;
            }
            }
        return -1;
        }

    }

