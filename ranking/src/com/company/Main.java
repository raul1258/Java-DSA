package com.company;
import java.io.*;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
for(int i=0;i<n;i++){
    arr[i]=sc.nextInt();
}
    for(int i=0;i<n;i++){
        int count=1;
        for( int j=0;j<n;j++){
            if(arr[j]>arr[i]){
                count++;
            }
        }
        System.out.print(count +" " );
    }

    }
}
