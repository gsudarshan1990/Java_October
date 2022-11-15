package org.importantquestions2;

import java.util.Arrays;

public class ArraysExample {

    public static void main(String[] args) {

        int[] array ={8,10,21,23,45,67};

        int[]   array2 = new int[array.length];

        int[] array3 = array.clone();

        int[] array4 = Arrays.copyOf(array, array.length);

        System.arraycopy(array, 0, array2, 0, array.length);

        for (int i = 0; i < array2.length; i++)
        {
            System.out.println(array2[i]);
        }

        System.out.println("--------------------------------");
        for (int i = 0; i < array4.length; i++)
        {
            System.out.println(array4[i]);
        }


        System.out.println("--------------------------------");
        for (int i = 0; i < array3.length; i++)
        {
            System.out.println(array3[i]);
        }



    }
}
