package com.bhus.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CopingAllElements {
    public static void main(String[] args) {
        List<String> items= new ArrayList<>();

        items.add("Bhushan");
        items.add("Gaurav");
        items.add("Pratik");

        List<String> items2=new ArrayList<>();
        items2.add("Shubham");
        items2.add("oooooo");
        items2.add("Puja");

       // Collections.copy(items,items2);

        System.out.println(Collections.disjoint(items,items2));

       /* for(int i=0;i< items.size();i++){
            System.out.println(items.get(i));
        }*/
    }
}
