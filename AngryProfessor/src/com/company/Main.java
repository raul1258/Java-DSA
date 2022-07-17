package com.company;
import java.io.*;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();

    for (int tc=0; tc<t;tc++) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        int count = 0;


        int arr[] = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
            if (arr[i] <= 0) {
                count++;
            }
        }
            if(count<k){
                System.out.println("yes");
            }else{
                System.out.println("No");
            }
        }

    }
}
