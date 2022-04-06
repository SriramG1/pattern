package com.company;
import java.util.*;

public class RomanInteger {
    public void convertor(String str){
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int result=0;
        for(int i=str.length()-1;i>=0;i--){
            if((str.charAt(i)=='V'||str.charAt(i)=='X')&&i>0){
                if(str.charAt(i-1)=='I'){
                    result-=2;
                }
            }
                result += map.get(str.charAt(i));
        }
        System.out.println(result);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        RomanInteger roman = new RomanInteger();
        while (true) {
            System.out.println("Enter your roman letter : ");
            String romanInteger = in.next();
            romanInteger = romanInteger.toUpperCase();
            roman.convertor(romanInteger);
            System.out.println("Press 1 for Continue 0 for exit ");
            char stopper= in.next().charAt(0);
            if(stopper=='0'){
                break;
            }
        }
    }
}