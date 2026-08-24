/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lec05_Random;

import java.util.*;

public class Sentinel {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        int avg = 0;
        int num = 0;
        do {
            System.out.println("Enter the number: ");
            num = sc.nextInt();
            if (num == 0 && count == 0) {
                System.out.println("Not have the value");
                return;
            } else 
                if (num != 0) {
                    sum += num;
                    count++;
                    avg = (sum / count);
                }
            } while (num != 0);
        System.out.println("Count: " + count);
        System.out.println("Sum: " + sum);
        System.out.println("Avg: " + avg);
    }
}
