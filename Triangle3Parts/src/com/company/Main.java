import java.io.*;
import java.sql.SQLOutput;
import java.util.*;

package com.company;

public class Main {

    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[][]=new int[n][n];
    int sumOfDiagonal=0;
    int sumOfUpper=0;
    int sumOfLower=0;
    for(int i=0;i<n;i++){
        for (int j=0;j<n;j++) {
            arr[i][j] = sc.nextInt();
        }
    }
        for(int i=0;i<n;i++){
            for (int j=0;j<n;j++) {
               if(i==j){
                   sumOfDiagonal=sumOfDiagonal+arr[i][j];
               }
               if(i<j){
                   sumOfUpper=sumOfUpper+arr[i][j];
               }
                if(i<j){
                    sumOfLower=sumOfLower+arr[i][j];
                }
            }
        }
            if(sumOfDiagonal%2==0){
                System.out.println(sumOfUpper-sumOfLower);
            }else{
                System.out.println(sumOfLower-sumOfUpper);
            }
    }
}
