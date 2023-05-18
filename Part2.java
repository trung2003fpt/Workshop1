package workshop1;

import java.util.Scanner;

public class Part2 {
    public static void main(String[] args) {
        float num1 , num2;
        String operator;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the number 1:");
        num1 = sc.nextFloat();
        System.out.println("Input the number 2:");
        num2 = sc.nextFloat();
        System.out.println("Input the operator (+-*/):");
        sc = new Scanner(System.in);
        operator = sc.nextLine();
           
        if(operator.equals("+")){
            System.out.println("The result of " + num1 + operator + num2 + "=" + (num1+num2));
        }
        else if(operator.equals("-")){
            System.out.println("The result of " + num1 + operator + num2 + "=" + (num1-num2));
        }
        else if(operator.equals("*")){
            System.out.println("The result of " + num1 + operator + num2 + "=" + (num1*num2));
        }
        else{
            System.out.println("The result of " + num1 + operator + num2 + "=" + (num1/num2));
        }
    }
}