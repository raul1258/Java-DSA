package com.company;
import java.io.*;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean canPairs = false;

        int arr[] = new int[2 * n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if ( (arr[i] + arr[j]) % 2 != 0) {
                    ans++;
                    canPairs = true;
                }
            }
        }
        System.out.println(ans);
        if (canPairs) {
            System.out.println("Yes");// write your code here
        } else {
            System.out.println("No");
        }
    }
}
