package com.company;

import java.util.Scanner;

public class PatternThree {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Your rows :");
        int rows=in.nextInt();

        for(int i=1;i<=rows;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        for(int i=1;i<=rows-1;i++)
        {
            for(int j=1;j<=rows-i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
