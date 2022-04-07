package com.company;

import java.util.Scanner;

public class WordsDifference {
    public boolean check(char character,String str){
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==character){
                return false;
            }
        }
        return true;
    }
    public void difference(String firstStr,String secondStr){
        String result="";
        firstStr=firstStr.toLowerCase();
        secondStr=secondStr.toLowerCase();
        for(int i=0;i<firstStr.length();i++){
            if(check(firstStr.charAt(i),secondStr)){
                result+=firstStr.charAt(i);
            }
        }
        System.out.println("Answer is : "+result);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two Strings : ");
        String firstStr=in.next();
        String secondStr=in.next();
        WordsDifference word = new WordsDifference();
        word.difference(firstStr,secondStr);
    }
}
