package com.company;

import java.util.Scanner;

public class AlphabetPattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your character : ");
        char alphabet=in.next().charAt(0);
        for(int i=0;i<alphabet-64;i++){
            for(int j=i;j<alphabet-64;j++){
                System.out.print((char)(alphabet-i)+" ");
            }
            System.out.println();
        }
    }
}
