package com.company;
import java.io.*;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    long n=sc.nextLong();
    int count=0;
    while(n>1){
        if(n%3==0){
            n/=2;
        }else if(n%3==1){
            n--;
        }else if(n%3==2){
            n--;
        }else {
            n++;
        }
        count++;

    }
        System.out.println(count);
    }
}
