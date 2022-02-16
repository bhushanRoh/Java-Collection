package com.bhus.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SearchingItems {
    public static void main(String[] args) {
        List<String> items=new ArrayList<>();

        items.add("Bhushan");
        items.add("Gaurav");
        items.add("Pratik");

        Collections.sort(items);

        System.out.println("The Index of Gaurav is: "+Collections.binarySearch(items,"Gaurav"));
    }
}
