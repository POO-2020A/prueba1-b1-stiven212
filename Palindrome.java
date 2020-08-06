/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.palindrome;

import java.util.Scanner;

/**
 *
 * @author Diseno Xtrmo
 */
public class Palindrome {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String s = inp.nextLine();
        //write your code below

        String normal = "";
        String viceversa = "";
        s.replace("á", "a");
        s.replace("é", "e");
        s.replace("í", "i");
        s.replace("ó", "o");
        s.replace("ú", "u");

        for (int i = 0; i < s.length(); i++) {

            if (!s.substring(i, i + 1).equals(" ")) {
                s.replace("á", "a");
                s.replace("é", "e");
                s.replace("í", "i");
                s.replace("ó", "o");
                s.replace("ú", "u");

                normal += s.substring(i, i + 1).toLowerCase();

            }

        }
      //  System.out.println(normal);
        for (int i = s.length()-1 ; i >= 0; i--) {

            if (!s.substring(i, i + 1).equals(" ")) {
                s.replace("á", "a");
                s.replace("é", "e");
                s.replace("í", "i");
                s.replace("ó", "o");
                s.replace("ú", "u");

                viceversa += s.substring(i, i + 1).toLowerCase();
            }

        }
       // System.out.println(viceversa);
        
        if(normal.equals(viceversa)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

    }
}
