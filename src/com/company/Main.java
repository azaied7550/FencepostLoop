package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner Keyboard = new Scanner(System.in);
        System.out.println("Enter a value : ");
        int n = Keyboard.nextInt();

        int counter = 1;
        while (counter <= n) {
            if (counter == n) {
                System.out.print(counter);
            }
            else {
                System.out.print(counter + ", ");
                            }
            counter++;
        }
    }
}