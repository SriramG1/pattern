package com.company;

import java.util.Scanner;

public class ReverseNumber {
    public int reverse(int number){
        int reverse=0;
        while (number>0){
            int rem=number%10;
            reverse=(reverse*10)+rem;
            number/=10;
        }
        return reverse;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int number= in.nextInt();
        ReverseNumber obj = new ReverseNumber();
        System.out.println(number-obj.reverse(number));
    }
}
