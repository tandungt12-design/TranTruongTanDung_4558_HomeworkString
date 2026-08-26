/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HomeworkArray;

import java.util.*;

public class Array {

    public static void input(int[] a, int n) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "]= ");
            a[i] = sc.nextInt();
        }
    }

    public static void caculate(int[] a, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
        }
        System.out.println("---Sum: " + sum);
        System.out.println("---Average: " + ((sum * 1.0) / n));
    }

    public static void output(int a[], int n) {
        System.out.println("---Display values: " + Arrays.toString(a));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length: ");
        int amount = sc.nextInt();
        int[] a = new int[amount];
        input(a, amount);
        caculate(a, amount);
        output(a, amount);
    }
}
