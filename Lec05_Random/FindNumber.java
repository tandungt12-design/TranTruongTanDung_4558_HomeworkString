/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lec05_Random;

import java.util.*;

public class FindNumber {

    public static void main(String[] args) {
        Random random = new Random();
        int n = random.nextInt(20 - 1 + 1) + 1;
        Scanner sc = new Scanner(System.in);
        boolean isfind = false;
        while (isfind == false) {
            System.out.println("Enter value (1-20): ");
            int value = sc.nextInt();
            if (value > n) {
                System.out.println("Less than");
            } else if (value < n) {
                System.out.println("Greater than");
            } else {
                System.out.println("Correct");
                isfind = true;
            }
        }
    }
}
