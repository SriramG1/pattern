package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class ArithmeticCalculation {
    String str;
    ArrayList<Character>operators = new ArrayList<>();
    ArrayList<String>operands = new ArrayList<>();
    public String convertor(String strNum1,String strNum2,char operator){
        int num1=Integer.parseInt(strNum1);
        int num2=Integer.parseInt(strNum2);
        int result = switch (operator) {
            case '/' -> num1 / num2;
            case '*' -> num1 * num2;
            case '+' -> num1 + num2;
            case '-' -> num1 - num2;
            default -> 0;
        };
        str=str.replace(strNum1+operator+strNum2,Integer.toString(result));
        return Integer.toString(result);
    }
    public void calculator(){
        for(int i=0;i<str.length();i++){
            if(!(str.charAt(i)>='0'&&str.charAt(i)<='9')) {
                operators.add(str.charAt(i));
            }
        }
        str=str+"M";
        String number="";
        for(int i=0;i<str.length();i++){
            if((str.charAt(i)>='0'&&str.charAt(i)<='9')) {
                number+=str.charAt(i);
            }
            else {
                operands.add(number);
                number="";
            }
        }
        int divideAndMul=0;
        for(int i=0;i<operators.size();i++){
            if((operators.get(i)=='/')||(operators.get(i)=='*')){
                char operator=operators.get(i);
                String cal=convertor(operands.get(i),operands.get(i+1),operator);
                int val = Integer.parseInt(cal);
                operators.remove(i);
                operands.remove(i+1);
                operands.set(i,cal);
                i=-1;
                if(i==operators.size()-1){
                    divideAndMul=val;
                }
            }
        }
        int addAndSub=0;
        for(int i=0;i<operators.size();i++){
            if((operators.get(i)=='+')||(operators.get(i)=='-')){
                char operator=operators.get(i);
                String cal=convertor(operands.get(i),operands.get(i+1),operator);
                int val=Integer.parseInt(cal);
                operators.remove(i);
                operands.remove(i+1);
                operands.set(i,cal);
                i=-1;
                if(i==operators.size()-1){
                    addAndSub=val;
                }
            }
        }
        System.out.println("Answer is : " +(divideAndMul+addAndSub));
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("Enter your value : ");
            String value = in.next();
            ArithmeticCalculation calculation = new ArithmeticCalculation();
            calculation.str = value;
            calculation.calculator();
            System.out.println("Press (1) for continue (0) for exit...");
            char choice =in.next().charAt(0);
            if(choice=='0'){
               break;
            }
        }
    }
}
