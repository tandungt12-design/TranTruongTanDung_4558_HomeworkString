/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package StringHomework;

import java.util.Scanner;

public class Exercise4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string (UPPER): ");
        String s = sc.nextLine();
        int indexStartMajor = 0, indexEndMajor = 0;
        int indexStartNumeric = 0;
        for (int i = 0; i < s.length(); i++) {
            if (!(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')) {

                indexEndMajor = i;
                indexStartNumeric = i;
                break;
            }
        }
        System.out.println("Major code: " + s.substring(0, indexEndMajor));
        System.out.println("Numeric Part: " + s.substring(indexStartNumeric));

    }
}
