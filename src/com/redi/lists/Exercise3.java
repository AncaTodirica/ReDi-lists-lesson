package com.redi.lists;

import java.util.ArrayList;
import java.util.Arrays;

//Create a method that checks if 2 lists have the same items.
//If the 2 lists have the same items, print in the console “The lists are identical” otherwise print “The lists are different”.
public class Exercise3 {

    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("green", "blue", "yellow"));
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("blue", "green", "yellow", "black"));

        boolean identical = areListsIdentical(list1, list2);

        if (identical) {
            System.out.println("Lists are identical");
        } else {
            System.out.println("Lists are not identical");
        }
    }

    public static boolean areListsIdentical(ArrayList<String> list1, ArrayList<String> list2) {
        if (list1.size() != list2.size()) {
            return false;
        }

        if (!list1.containsAll(list2)) {
            return false;
        }

        return true;
    }
}
