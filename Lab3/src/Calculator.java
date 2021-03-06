/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Winnie Wu, Kenny Tsang
 */

import java.util.Scanner;
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num1, num2;
        String operation;
        Scanner keyboard = new Scanner(System.in);
        
        // Ask the user to enter an operator.
        Scanner operator = new Scanner(System.in);
        System.out.print("Enter an operator: ");
        operation = operator.next();
        
        // Ask the user to enter an integer.
        System.out.print("Enter an integer: ");
        num1 = keyboard.nextInt();

        // Ask the user to enter another integer.
        System.out.print("Enter another integer: ");
        num2 = keyboard.nextInt();

        // When addition is selected by the user.
        if (operation.equals("+"))
            {
                System.out.println("The answer is: " + (num1 + num2));
            }
        
        // When subtraction is selected by the user.
        else if (operation.equals("-"))
                {
                    System.out.println("The answer is: " + (num1 - num2));
                    }
        
        // When multiplication is selected by the user.
        else if (operation.equals("*"))
                {
                    System.out.println("The answer is: " + (num1 * num2));
                }
        
        // When division is selected by the user.
        // When the second integer is 0, operation will be terminated.
        else if (operation.equals("/"))
                {
                    if (num2 == 0)
                    {
                        System.out.println("ERROR: Cannot divide by 0.");
                    }
                    else if (num1 % num2 == 0)
                    {
                        System.out.println("The answer is: " + (num1 / num2));
                    }
                        else 
                        {
                            int division = num1 / num2;
                            int fraction = num1 % num2;
                            
                            System.out.println("The answer is: " + division + " and "
                                    + fraction + "/" + num2);
                        }

                }                
        
        // When none of the correct operators is selected.
        else                         
            System.out.println("ERROR: " + operation + " is not a valid operator!");
                        
    }
    
}
