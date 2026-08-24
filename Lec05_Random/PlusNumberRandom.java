/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lec05_Random;

import java.util.*;

public class PlusNumberRandom {

    public static void main(String[] args) {
        int count = 0, number = 0;
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int breakout = 0, mark = 0, count_number = 0, sum = 0;
        while (true) {
            int amount = random.nextInt(5 - 2 + 1) + 2;
            while (count_number < amount) {
                number = random.nextInt(10 - 1 + 1) + 1;
                System.out.print(number + " + ");
                sum += number;
                count_number++;
            }
            count_number = 0;
            System.out.println(" = ");
            int result = sc.nextInt();
            if (result == sum) {
                System.out.println("Correct");
                mark++;
            } else {
                System.out.println("Wrong");
                if (breakout == 3) {
                    System.out.println("Wrong\nThe mark: " + mark);
                    break;
                }
                breakout++;
            }
            sum = 0;
        }
    }
}
