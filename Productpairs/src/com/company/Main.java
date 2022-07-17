package com.company;
import java.io.*;
public class Main {
    public static long sumOfProduct(int n)
    {
        int ans=0;

        for(int x=0;x<=n;x++)
        {
            int y = n/x;

            ans +=(y*x);
        }
        return ans;// code here
    }
    public static void main(String[] args){
        int n = 10;
        System.out.println(sumOfProduct(n));
    }
}