package com.robino;

public class ArrayClass {
    //Declaration of array example
    public void intArrayExample(){
        int monthDays[];
        monthDays = new int[12];
        monthDays[0] = 31;
        monthDays[1] = 28;
        monthDays[2] = 31;
        monthDays[3] = 30;
        monthDays[4] = 31;
        monthDays[5] = 30;

        System.out.print("April has ");
        System.out.println(monthDays[3] + " days.");

        //instead of the new operator word, the array can be declared this way
        //int monthDay [] = {31,28,31,30,31,30};
    }

    /**
     * Multidimensional arrays are arrays of arrays:
     * 1) Declaration: int array[][];
     * 2)Creation : int array = new int[2][3];
     * 3)Initialisation: int array[][] = { {1, 2, 3}, {4, 5, 6} };
     */

    public void multipleDimensionalArray(){
        int array[][] = { {1, 2, 3}, {4, 5, 6} };
        int i, j, k = 0;
        for(i=0; i<2; i++) {
            for (j = 0; j < 3; j++)
                System.out.print(array[i][j] + " ");
            System.out.println();
        }
    }
}
