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
public class Exercise10 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = sc.nextLine();
        System.out.println("The word you want to replace: ");
        String replace = sc.nextLine();
        System.out.println("The string after replaced: " + s.replace(replace, "****"));

    }
}
