package com.company;

import java.util.Scanner;

public class MobileNumberChecker {
    private boolean numberChecker(String number){
        if(number.length()!=10){
            return false;
        }
        if(!(Character.getNumericValue(number.charAt(0))<=9&&Character.getNumericValue(number.charAt(0))>=6)){
            return false;
        }
        System.out.println();
        for(int i=0;i<number.length();i++){
            if(!Character.isDigit(number.charAt(i))){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("Enter your number : ");
            String number = in.next();
            MobileNumberChecker numberChecker = new MobileNumberChecker();
            boolean isFormat = numberChecker.numberChecker(number);
            if (isFormat) {
                System.out.println(number + " is mobile number...");
            } else {
                System.err.println(number + " is not a mobile number...");
            }
            System.out.println("Press 1 for continue...");
        } while (in.nextInt() == 1);
    }
}
