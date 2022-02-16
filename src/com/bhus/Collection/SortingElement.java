package com.bhus.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SortingElement {
    public static void main(String[] args) {
        List<String> items= new ArrayList<>();

        items.add("Bhushan");
        items.add("Gaurav");
        items.add("Pratik");
        items.add("Gaiki");

        Collections.addAll(items,"Mosin","Danish","Nidhi");

        Collections.sort(items);

        for(int i=0;i< items.size();i++){
            System.out.println(items.get(i) + " ");
        }

        System.out.println(" ");

        Collections.sort(items,Collections.reverseOrder());

        for (int i=0;i<items.size();i++){
            System.out.println(items.get(i));
        }
    }
}
