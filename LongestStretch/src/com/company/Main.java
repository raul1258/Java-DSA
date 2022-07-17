package com.company;
import java.util.*;

public class Main {

    public static void  main(String[] args) {
	Scanner sc =new Scanner(System.in);
    int n =sc.nextInt();
    int arr[]=new int[n];
    int count=0;
    int max_count=0;

    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    for(int i=0;i<n;i++){
        if(arr[i]>=0){
            count++;
        }else{
            count=0;
        }if(count>max_count){
            max_count=count;
        }
    }
        System.out.println(max_count);

        // write your code here
    }
}
