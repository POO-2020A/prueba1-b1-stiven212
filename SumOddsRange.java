/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author Diseno Xtrmo
 */
public class SumOddsRange {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("#1: ");
    int num1 = s.nextInt();
    System.out.print("#2: ");
    int num2 = s.nextInt();
    //start below
    int sum=0;
    for(int i=num1; i<=num2; i++){
        if(i%2 !=0){
            sum += i;
        }
    }
        System.out.println(sum);
    
  } 
}
