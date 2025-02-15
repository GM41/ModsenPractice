package org.example;
import java.util.Scanner;

public class SecondTask {

    public void TwoSum(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input array size:");
        int arraySize = scanner.nextInt();

        int[] array = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            System.out.println("Input number on " + (i+1) + " position");
            array[i] = scanner.nextInt();
        }
        System.out.println("Input target:");
        int target = scanner.nextInt();
        Solution(array, target);
    }

    public void Solution(int[] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i] + arr[j] == target){
                    System.out.println("Solution is [" + i + ", " + j + "]");
                }
            }
        }
    }

}
