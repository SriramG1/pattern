package com.company;

public class CommonPrefix {
    public String commonPrefix(String str1,String str2){
        String result="";
        for(int i=0;i<str1.length() && i<str2.length();i++){
            if(str1.charAt(i)!=str2.charAt(i)){
                break;
            }
            result+=str1.charAt(i);
        }
        return result;
    }
    public static void main(String[] args) {
        CommonPrefix common = new CommonPrefix();
        String[] array={"geeks","geeze","geeksfor","geeksforgeeks"};
        String prefix=array[0];
        for(int i=1;i< array.length;i++){
            prefix=common.commonPrefix(prefix,array[i]);
        }
        System.out.println(prefix);
    }
}
