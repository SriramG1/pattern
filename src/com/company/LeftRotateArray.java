package com.company;

public class LeftRotateArray {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        int n=4;
        for(int i=0;i<n;i++){
            int first=array[0];
            int j;
            for(j=0;j<array.length-1;j++){
                array[j]=array[j+1];
            }
            array[j]=first;
        }
        for(int i:array){
            System.out.print(i+" ");
        }
        String s="hello";
        StringBuffer sb=new StringBuffer(s);
        System.out.println(sb.reverse());
    }
}
