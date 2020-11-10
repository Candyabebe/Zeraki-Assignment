package com.company;

public class Solution2 {
    //Question 2
     static String reverseInFour(String originalString) {

        //Check for empty or string shorter than 3 char

        if (originalString.length() < 4) {
            return originalString;
        } else {
            String reversed = "";
            String fourChar;
            int min = 0;
            int max = 4;
            //Reverse complete substring
            while (max < originalString.length()) {
                fourChar = new StringBuilder(originalString.substring(min, max)).reverse().toString();
                reversed = reversed + fourChar;
                min = max;
                max += 4;
            }

            //Append incomplete substring
            if (max > originalString.length() - 1) {
                fourChar = originalString.substring(min);
                reversed = reversed + fourChar;
            }
            return reversed;
        }

    }

    public  static void main(String[] args) {
         String origin="";
        try {
                for (String str : args){
                    origin=origin+str;
                }
            String reverse=reverseInFour(origin);
            System.out.println("Output : "+reverse);
        } catch (Exception e) {
            System.out.println("Wong Argument.Pass a valid String");
        }
    }

}
