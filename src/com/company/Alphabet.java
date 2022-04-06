package com.company;

import java.util.Scanner;

public class Alphabet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your character : ");
        char alphabet=in.next().charAt(0);
        for(int i=alphabet;i<=90;i++){
            System.out.print((char)i+" ");
        }
    }
}
