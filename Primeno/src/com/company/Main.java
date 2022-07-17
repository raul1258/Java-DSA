package com.company;
import java.io.*;
import java.sql.SQLOutput;
import java.util.*;
public class Main {
    public static void primeNumber(int n){
        int temp=0;
        for(int i=2;i<=n;i++) {
            if (n % i == 0) {
                temp = temp + 1;
            }
        }
        if(temp>0){
            System.out.println("Prime No.");
        }else{
            System.out.println("Not Prime No.");
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        primeNumber(n);
    }
}

