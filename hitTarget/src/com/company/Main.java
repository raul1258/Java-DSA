package com.company;
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        boolean found=false;

        int arr[] = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 1; i <=n; i++) {
            if (arr[i] == k) {
               found=true;
               break;
            }
        }
        if(found){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}



