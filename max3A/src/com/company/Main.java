package com.company;
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();
    int arr[]=new int[n];

    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    int first=0,second=0,third=0;
    for( int i=0;i<n;i++){
        if(arr[i]>first){
            third=second;
            second=first;
            first=arr[i];
        }else if(arr[i]>second){
            third=second;
            second=arr[i];
        }else if(arr[i]>third){
            third=arr[i];
        }
    }
    int avg=(first+second+third)/3;
        System.out.println(avg);
    }
}
