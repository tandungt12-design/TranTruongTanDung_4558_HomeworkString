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
public class Exercise1 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        System.out.println("Trimmed: " + s.trim());
        System.out.println("UpperCase: " + s.toUpperCase());
        System.out.println("LowerCase: " + s.toLowerCase());
        System.out.println("Length: " + s.length());
        String tam = s.trim();
        System.out.println("Length after trimmed: " + tam.length());

    }
}
