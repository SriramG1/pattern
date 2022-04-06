package com.company;

import java.util.HashMap;

public class RomanToInteger {
    public int convertor(String str){
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int result=0;
        for(int i=0;i<str.length();i++){
            int s1=map.get(str.charAt(i));
            if(str.length()>(i+1)){
                int s2=map.get(str.charAt(i+1));
                if(s1>=s2){
                    result+=s1;
                }
                else {
                    result+=s2-s1;
                    i++;
                }
            }
            else {
                result+=s1;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        RomanToInteger obj = new RomanToInteger();
        System.out.println(obj.convertor("LX"));

    }
}
