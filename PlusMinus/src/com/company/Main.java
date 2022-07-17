package com.company;
import java.util.*;
import java.io.*;
public class Main {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    double negative= 0;
    double positive= 0;
    double zeros= 0;

    for(int i=0;i<n;i++){
        int data=sc.nextInt();
        if(data<0){
            negative++;// write your code here
        }else if(data>0){
            positive++;
        }else {
            zeros++;
        }
    }
        System.out.println(negative/n);
        System.out.println(positive/n);
        System.out.println(zeros/n);
    }
}
