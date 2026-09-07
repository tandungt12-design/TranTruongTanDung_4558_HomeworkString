/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package StringHomework;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Exercise3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = sc.nextLine();
        System.out.println("Using Concatenation: "+s.concat(" University"));
        System.out.println("Using +: "+s+" University");
        System.out.println("Original: "+ s);
    }
}
