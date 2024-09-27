package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int Loop = scan.nextInt();

        System.out.println("Hello and welcome!");

        for (int i = 1; i <= Loop; i++) {
            System.out.println("i = " + i);
        }

        int[] numbers = {1, 2, 3, 4, 5};
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}