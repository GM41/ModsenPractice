package org.example;
import java.util.Scanner;

public class FirstTask {
    public void isItPalindrome(){
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("Input number:");
        number = scanner.nextInt();

        String str = "" + number;

        StringBuilder b = new StringBuilder(str);
        StringBuilder c = new StringBuilder(str);
        c.reverse();

        System.out.println(b.toString().equals(c.toString()) ? "It`s a palindrome" : "It`s not a palindrome");

    }
}
