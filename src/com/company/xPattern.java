package com.company;

public class xPattern {
    public static void main(String[] args) {
        String str="123456789";
        int s=0,k=str.length()-1;
        for(int i=0;i<str.length();i++) {
            for (int j = 0; j <str.length(); j++) {
                if((i==j)||(i==s&&j==k)) {
                    System.out.print(str.charAt(i) + " ");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            k--;
            s++;
        }
    }
}
