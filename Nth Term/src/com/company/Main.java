package com.company;
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Nth Term");
    int n = sc.nextInt();
    int i, sum = 0;

        for(i=1;i<=n;i++)
            sum = sum +i;
        System.out.println(sum);// write your code here
    }
}



