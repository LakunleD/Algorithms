/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author Lakunle
 */
public class PrintNumbers {
    public static void main(String[]args){
        int i;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int number = input.nextInt();
        String prev = "";
        
        for(i=1; i<=number; i++){
            System.out.println(prev +=  i);
        }
    }
}
