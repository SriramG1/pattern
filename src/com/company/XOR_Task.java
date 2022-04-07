package com.company;

import java.util.Scanner;

public class XOR_Task {
    public void maximumXOR(int[] array){
        int max=0;
        for(int i=0;i< array.length-1;i++){
            for(int j=i+1;j< array.length;j++){
                if(i<j){
                   if((array[i]^array[j])>max){
                       max=array[i]^array[j];
                   }
                }
            }
        }
        System.out.println("Your answer is : "+max);
    }
    public static void main(String[] args) {
        XOR_Task obj = new XOR_Task();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your array length : ");
        int length=in.nextInt();
        int[] array = new int[length];
        System.out.println("Enter values : ");
        for(int i=0;i<length;i++){
            array[i]=in.nextInt();
        }
        obj.maximumXOR(array);
    }
}
