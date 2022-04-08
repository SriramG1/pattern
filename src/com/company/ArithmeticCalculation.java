package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class ArithmeticCalculation {
    String str;
    public int counter(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='('){
                count++;
            }
        }
        return count;
    }
    public String split(){
        String sub="";
        boolean stopper = false;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='('){
                i++;
                for(int j=i;j<str.charAt(j);j++){
                    if(str.charAt(j)==')'){
                        stopper=true;
                        break;
                    }
                    sub+=str.charAt(j);
                    if(str.charAt(j)=='('){
                        sub="";
                    }
                }
            }
            if(stopper){
                break;
            }
        }
        return sub;
    }
    public static void main(String[] args) {
        ArithmeticCalculation cal = new ArithmeticCalculation();
        Driver driver = new Driver();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your value : ");
        String value = in.next();
        cal.str=value;
        int count=cal.counter(value);
        for(int i=1;i<=count;i++) {
            String result = cal.split();
            int res = driver.calculator(result);
            if(count==i){
                res=Math.abs(res);
            }
            cal.str = cal.str.replace("(" + result + ")", Integer.toString(res));
        }
        int answer=driver.calculator(cal.str);
        System.out.println("Your answer is : "+answer);
    }
}
class Driver{
    private String str;
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
    public int calculator(String str){
        ArrayList<Character>operators = new ArrayList<>();
        ArrayList<String>operands = new ArrayList<>();
        this.str=str;
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
        return divideAndMul+addAndSub;
    }
}
