package com.bhus.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class AddElement {
    public static void main(String[] args) {
        List<String> items= new ArrayList<>();
        items.add("Bhushan");
        items.add("Rajesh");
        items.add("Gaurav");

        Collections.addAll(items,"Gaiki","Pratik","Shubham");

        for(int i=0;i< items.size();i++){
            System.out.println(items.get(i));
        }
    }
}
