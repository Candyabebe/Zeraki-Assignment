package com.company;

import java.util.Arrays;

public class Solutions {

    //Question 1;
    int returnMissingInt(int intArray[]) {

        int temp;
        int missing = 0;
        //Sort
        for (int x = 0; x < intArray.length; x++) {
            for (int y = x; y > 0; y--) {
                if (intArray[y] < intArray[y - 1]) {
                    temp = intArray[y];
                    intArray[y] = intArray[y - 1];
                    intArray[y - 1] = temp;
                }
            }
        }
        //Then Compare the ints values

        for (int i = 0; i < intArray.length; i++) {
            if (((intArray[i + 1]) - (intArray[i])) > 1) {
                missing = intArray[i] + 1;
                break;
            }
        }
        return missing;
    }

    //Question 2
    String reverseInFour(String s) {
//Check for empty or string shorter than 3 char
        if (s.length() < 4) {
            return s;
        } else {
            String reversed = "";
            String sub;
            int min = 0;
            int max = 4;
            //Reverse complete substring
            while (max < s.length()) {
                sub = new StringBuilder(s.substring(min, max)).reverse().toString();
                reversed = reversed + sub;
                min = max;
                max += 4;
            }

            //Append incomplete substring
            if (max > s.length() - 1) {
                sub = s.substring(min);
                reversed = reversed + sub;
            }
            return reversed;
        }

    }

    //Question 3
    int numberOfSteps(int distance, int spacing) {
        int steps = distance / spacing;
        if ((distance % spacing) > 0) {
            steps += 1;
        }
        return steps;

    }

//Question 4 is in sqlSolution.sql file

}
