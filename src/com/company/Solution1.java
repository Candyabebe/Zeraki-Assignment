package com.company;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.Collections;

/*



 */
public class Solution1 {

    //Question 1;
   static int returnMissingInt(ArrayList<Integer> intArray) {

        int temp;
        int missing = 0;
        //Sort
       Collections.sort(intArray);
        //Then Compare the ints values

        for (int i = 0; i < intArray.size(); i++) {
            if (((intArray.get(i + 1)) - (intArray.get(i))) > 1) {
                missing = intArray.get(i) + 1;
                break;
            }
        }
        return missing;
    }

    public  static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        try {
            for (int x=0; x<args.length; x++){
                int i=Integer.parseInt(args[x]);
                list.add(i);
            }
            int missing=returnMissingInt(list);
            System.out.println("Missing int is: "+missing);
        } catch (Exception e) {
            System.out.println("Wong Argument.Kindly Enter an Integer");
        }
    }


}
