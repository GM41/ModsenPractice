package org.example;

import java.util.Scanner;

public class ThirdTask {

    public void SingleNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input array size:");
        int arraySize = scanner.nextInt();

        int[] array = new int[arraySize];
        System.out.println("Input " + arraySize + " numbers:");
        for (int i = 0; i < arraySize; i++) {
            array[i] = scanner.nextInt();
        }
        solution(array);
    }
    public void solution(int[] arr){
        int res = 0;
        for (int i : arr) {
            res ^= i;
        }
        System.out.println("Single number is: " + res + " !");
    }
}
