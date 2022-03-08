package com.bhus.List;

import java.util.ArrayList;
import java.util.List;

public class Example1 {
    public static void main(String[] args) {
        List<Integer> list= new ArrayList<Integer>();

        list.add(0,1);
        list.add(1,2);

        System.out.println(list);

        List<Integer> list2= new ArrayList<Integer>();
        list2.add(3);
        list2.add(4);
        list2.add(5);
        list.addAll(1,list2);



        System.out.println(list);

        list.set(0,5);
        System.out.println(list);
    }
}
