package com.company;
import java.io.*;
import java.util.*;

public class Main {
    static boolean canPairs(int[] arr, int n){

        if (n% 2 == 1)
            return false;
        int odd_count = 0, even_count = 0;

        for(int i=0;i<n;i++){
            if (arr [i] % 2 ==0)
                even_count++;
            else
                odd_count++;
        }
        if (even_count %2 ==0 && odd_count % 2==0){
            return true;
        }else {
            return false;
        }

        }

    public static void main(String[] args) {
        int [] arr = {1,2,3,5,4};
       int N =arr.length;
        if(canPairs(arr, N))
            System.out.println("Yes");
        else
            System.out.println("No");

    }
}



