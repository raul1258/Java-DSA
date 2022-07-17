package com.company;
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
         int count = 0;
        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();// write your code here
        }
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if(arr[i] - arr[j] == K || arr[j] - arr[i] ==K){
                    count++;
                }
            }
        }

        System.out.println(count);
    }
    }
