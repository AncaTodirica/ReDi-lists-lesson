package com.redi.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

//Build a train using ArrayList and LinkedList.
//Create an ArrayList that holds the waggons, then create a LinkedList that contains the waggons and has also a locomotive.
// Print the train in the console.
public class Exercise1 {

    public static void main(String[] args) {
        ArrayList<String> waggons = new ArrayList<String>(Arrays.asList("wagon1", "wagon2", "wagon3"));

        LinkedList<String> train = new LinkedList<String>(waggons);

        train.addFirst("locomotive");

        for (String node : train) {
            System.out.print(node + " ");
        }
    }
}
