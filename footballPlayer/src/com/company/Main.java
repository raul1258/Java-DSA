package com.company;
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int G1 = sc.nextInt();
        int P1 = sc.nextInt();
        int D1 = sc.nextInt();
        int G2 = sc.nextInt();
        int P2 = sc.nextInt();
        int D2 = sc.nextInt();
        int count=0;
        if(G1>G2){
            count=1;
        }else{
            count=0;
        }if(P1>P2){
            count=2;
        }else{
            count=0;
        }if(D1>D2){
            count=3;
        }else{
            count=0;
        }
    if(count>=2){
        System.out.println("A");
    }else{
        System.out.println("B");
    }

    }

}
