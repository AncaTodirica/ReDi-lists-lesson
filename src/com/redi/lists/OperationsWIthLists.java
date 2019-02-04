package com.redi.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class OperationsWIthLists {

    public static void main(String[] args) {

        // Creates a list by specifying the number of elements.
        ArrayList<String> myList = new ArrayList<String>(10);

        // Creates a list from another list.
        ArrayList<String> myList2 = new ArrayList<>(myList);

        // Creates a list and initializes it with items.
        ArrayList<String> myList3 = new ArrayList<String>(Arrays.asList("white", "blue", "black", "red"));

        // Creates a list without size.
        ArrayList<Integer> myList4 = new ArrayList<Integer>();

        //Ads an item at the end of the list.
        myList.add("one");

        //Ads an item to a position in the list.
        myList.add(1, "two");

        //Ads all items from myList3 at the end of the list.
        myList.addAll(myList3);

        myList.forEach(it -> System.out.print(it + " "));
        System.out.println();

        // Removes the item with value "two".
        myList.remove("two");

        // Removes item at index 1.
        myList.remove(1);

        //removes all items from myList3
        myList.removeAll(myList3);

        // Get element at index 1.
        String item = myList3.get(1);
        System.out.println("Item at position 3 is: " + item);

        //Checks if item "two" is in myList;
        boolean contains = myList.contains("two");

        myList.forEach(System.out::println);

        //_________________________________________________________LinkedList_______________________________________________

        //Creating a linked list with no parameters.
        LinkedList<String> myLinkedList = new LinkedList<String>();

        //Creating a linked list with the items from another list.
        LinkedList<String> myLinkedList1 = new LinkedList<String>(myList);

        myLinkedList.addFirst("Head");

        myLinkedList.addLast("whatever");

        myLinkedList.getFirst();

        myLinkedList.getLast();

    }
}
