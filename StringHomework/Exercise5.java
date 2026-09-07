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
public class Exercise5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = sc.nextLine();
        System.out.println("Starts with report: " + s.startsWith("report"));
        System.out.println("Ends with .pdf: " + s.endsWith(".pdf"));
        System.out.println("FirstCharacter: " + s.charAt(0));
        System.out.println("LastCharacter: " + s.charAt(s.length() - 1));
    }
}
