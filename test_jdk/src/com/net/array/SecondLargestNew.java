package com.net.array;

public class SecondLargestNew {
    public static void main(String args[])
    {
        int[] array = {69,12,76,26,82,3,89,96,94,112};

        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;


        for (int i = 0; i < array.length; i++)
        {
            if (array[i] > highest)
            {
                // ...shift the current highest number to second highest
                secondHighest = highest;
                // ...and set the new highest.
                highest = array[i];
            } else if (array[i] > secondHighest)
            {
                // Just replace the second highest
                secondHighest = array[i];
            }
        }
        System.out.println("second largest is "+secondHighest );
        System.out.println("largest is "+ highest);
    }
}
