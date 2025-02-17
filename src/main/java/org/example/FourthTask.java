package org.example;
import java.util.Scanner;

public class FourthTask {

    public void ContainsDuplicate(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input array size:");
        int arraySize = scanner.nextInt();

        int[] array = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            System.out.println("Input number on " + (i+1) + " position");
            array[i] = scanner.nextInt();
        }
        Solution(array);
    }

    public void Solution(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] == arr[j]){
                    System.out.println("true");
                    return;
                }
            }
        }
        System.out.println("false");
    }

}
