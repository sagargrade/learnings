package edu.mylearning.data.structure.array;

public class ArrayDS {
    public static void main(String[] args) {
        int[] array = new int[6];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        for (int value : array) {
            System.out.println(value);
        }
    }
}
