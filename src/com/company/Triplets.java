package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Triplets {
    public static void main(String[] args) {
        HashSet<ArrayList<Integer>> set = new HashSet<>();
        int[] array = {-1,0,1,2,-1,-4};
        for(int i=0;i< array.length;i++){
            for(int j=i+1;j< array.length;j++){
                for(int k=j+1;k< array.length;k++){
                   if(array[i]+array[j]+array[k]==0){
                       ArrayList<Integer>arrayList= new ArrayList<>();
                       arrayList.add(array[i]);
                       arrayList.add(array[j]);
                       arrayList.add(array[k]);
                       Collections.sort(arrayList);
                       set.add(arrayList);
                   }
                }
            }
        }
        for(ArrayList<Integer> i:set){
            System.out.println(i);
        }
    }
}
